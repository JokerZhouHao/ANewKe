package Utility;

/**
 * 提供一些字符串操作
 * @author ZhouHao
 * @since 2019年11月21日
 */
public class StringUtility {
	
	public static void replaceForCopyFromWord() {
		
		String st = "the temporal differences between the keyword-matched\r\n" + 
				"vertices and the query timestamp. The other way is\r\n" + 
				"using a temporal range to filter keyword-matched vertices. The novelty of kSP and kSPT queries is that they\r\n" + 
				"are spatio-temporal-aware and that they do not rely on\r\n" + 
				"the use of structured query languages. We design an\r\n" + 
				"efficient approach containing two pruning techniques\r\n" + 
				"and a data preprocessing technique for the processing of kSP queries. The proposed approach is extended\r\n" + 
				"and improved with four optimizations to evaluate kSPT\r\n" + 
				"queries. Extensive empirical studies on two real datasets\r\n" + 
				"demonstrate the superior and robust performance of\r\n" + 
				"our proposals compared to baseline methods.";
		
		
		
		String targetSeq = "\\r\\n";
		String repSeq = " ";
		System.out.println(st.replaceAll(targetSeq, repSeq));
	}
	
	
	public static void main(String[] args) {
		replaceForCopyFromWord();
	}
}
