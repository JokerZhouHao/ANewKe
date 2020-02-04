package net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpScanner {
	private final static RequestConfig CONFIG_TIMEOUT = RequestConfig.custom().setConnectTimeout(200).build();
	private final static CloseableHttpClient  client = HttpClients.createDefault();
	
	/**
	 * 判断addr的80端口是否开启了http服务
	 * @param addr
	 * @return
	 */
	public static boolean ping(String addr){
		if(!addr.startsWith("http://") && !addr.startsWith("https://")) {
			addr = "http://" + addr;
		}
		HttpGet get = new HttpGet(addr);
		get.setConfig(CONFIG_TIMEOUT);
		try {
			CloseableHttpResponse response = client.execute(get);
//			System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
			response.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * 判断addrs的80端口是否开启了http服务
	 * @param addrs
	 */
	public static void ping(Collection<String> addrs) {
		for(String addr : addrs) {
			if(ping(addr)) {
				System.out.println(addr);
			}
		}
	}
	
	/**
	 * 判断left+right的地址的80端口是否开启了http服务，例如192.168.0.   1    100
	 * @param left
	 * @param rightStart
	 * @param rightEnd
	 */
	public static void ping(String left, int rightStart, int rightEnd) {
		List<String> success = new ArrayList<String>();
		for(int right = rightStart; right <= rightEnd; right++) {
			String addr = left + right;
			if(ping(addr)) {
				System.out.println("ping " + addr + " success");
				success.add(addr);
			} else {
				System.out.println("ping " + addr + " fail");
			}
		}
		System.out.println("\n------------ success addrs --------------");
		for(String addr : success) {
			System.out.println(addr);
		}
		
	}
	
	public static void main(String[] args) throws Exception{
//		String addr = "192.168.0.109";
//		System.out.println(ping(addr));
		ping("192.168.0.", 0, 255);
	}
}
