package Utility;

/**
 * 提供一些字符串操作
 * @author ZhouHao
 * @since 2019年11月21日
 */
public class StringUtility {
	
	public static void replaceForCopyFromWord() {
		String st = "Abstract RDF data are traditionally accessed using\r\n" + 
				"structured query languages, such as SPARQL. However, this requires users to understand the language as\r\n" + 
				"well as the RDF schema. Keyword search on RDF data\r\n" + 
				"aims at relieving users from these requirements; users\r\n" + 
				"only input a set of keywords and the goal is to find\r\n" + 
				"small RDF subgraphs that contain all keywords. At\r\n" + 
				"the same time, popular RDF knowledge bases also include spatial and temporal semantics, which opens the\r\n" + 
				"road to spatio-temporal-based search operations. In this\r\n" + 
				"work, we propose and study novel keyword-based search\r\n" + 
				"queries with spatial semantics on RDF data, namely\r\n" + 
				"kSP queries. The objective of the kSP query is to find\r\n" + 
				"RDF subgraphs which contain the query keywords and\r\n" + 
				"are rooted at spatial entities close to the query location. To add temporal semantics to the kSP query, we\r\n" + 
				"propose the kSPT query that uses two ways to incorporate temporal information. One way is considering";
		String targetSeq = "\\r\\n";
		String repSeq = " ";
		System.out.println(st.replaceAll(targetSeq, repSeq));
	}
	
	
	public static void main(String[] args) {
		replaceForCopyFromWord();
	}
}
