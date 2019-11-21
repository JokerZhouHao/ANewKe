package Utility;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileFormatTranslator {
	
	static class TxtFile {
		String path;
		String encode;
		public TxtFile(String path, String encode) {
			super();
			this.path = path;
			this.encode = encode;
		}
		
		public TxtFile(TxtFile tf) {
			this.path = tf.path;
			this.encode = tf.encode;
		}
	}
	
	public static void transFileFormat(TxtFile sourTF, TxtFile desTF) throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourTF.path));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desTF.path));
		byte[] bts = new byte[bis.available()];
		bis.read(bts);
		bos.write(new String(bts, sourTF.encode).getBytes(desTF.encode));
		bis.close();
		bos.close();
	}
	
	private static void transDictoryFormat(File sourFile, TxtFile sourTF, TxtFile desTF) throws Exception {
		if(sourFile.isDirectory()) {
			desTF = new TxtFile(desTF);
			desTF.path += sourFile.getName() + File.separator;
			if(!new File(desTF.path).exists())	new File(desTF.path).mkdir();
			for(File f : sourFile.listFiles()) {
				transDictoryFormat(f, sourTF, desTF);
			}
		} else {
			sourTF = new TxtFile(sourTF);
			sourTF.path = sourFile.getAbsolutePath();
			transFileFormat(sourTF, new TxtFile(desTF.path + sourFile.getName(), desTF.encode));
		}
	}
	
	public static void transDictoryFormat(TxtFile sourTF, TxtFile desTF) throws Exception {
		System.out.println("> start . . ");
		if(!desTF.path.endsWith(File.separator))	desTF.path += File.separator;
		File file = new File(sourTF.path);
		for(File f : file.listFiles()) {
			transDictoryFormat(f, sourTF, desTF);
		}
		System.out.println("> end");
	}
	
	public static void transGBK2UTF8(String sourPath, String desPath) throws Exception {
		transDictoryFormat(new TxtFile(sourPath, "GBK"), new TxtFile(desPath, "UTF-8"));
	}
	
	public static void main(String[] args) throws Exception {
		String sourPath = "C:\\Users\\Monica\\Desktop\\test\\t1";
		String desPath = "C:\\Users\\Monica\\Desktop\\test\\t2";
		transGBK2UTF8(sourPath, desPath);
	}

}
