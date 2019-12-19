package Utility;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * 提供一些字符串操作
 * @author ZhouHao
 * @since 2019年11月21日
 */
public class StringUtility {
	
	public static String replaceForCopyFromWord() {
		
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
		return st.replaceAll(targetSeq, repSeq);
	}
	
	public static void removeFirst(String st) {
		Scanner scan = new Scanner(st);
		String line = "";
		StringBuffer sb = new StringBuffer();
		String item = null;
		while(scan.hasNext() && (line = scan.nextLine()) != null) {
			if(line.charAt(0) >= '0' && line.charAt(0) <= '9' && (line.indexOf(".")==1 || line.indexOf(".")==2)) {
				item = sb.toString();
				if(sb.length() > 0)	System.out.println(item.substring(item.indexOf(".") + 2));
				sb.delete(0, sb.length());
			}
			sb.append(line);
		}
		item = sb.toString();
		if(sb.length() > 0)	System.out.println(item.substring(item.indexOf(".") + 2));
	}
	
	public static void main(String[] args) {
		String inputString = "1. Alternative fueling station locator. http://www.afdc.\r\n" + 
				"energy.gov/locator/stations/\r\n" + 
				"2. Crime in chicagoland. http://crime.chicagotribune.\r\n" + 
				"com/\r\n" + 
				"3. Data.gov. http://www.data.gov\r\n" + 
				"4. Dbpedia. http://wiki.dbpedia.org\r\n" + 
				"5. Hospital compare. http://health.data.gov/def/cqld\r\n" + 
				"6. Owlim-se. http://owlim.ontotext.com/display/\r\n" + 
				"OWLIMv43/OWLIM-SE\r\n" + 
				"7. Parliament. http://parliament.semwebcentral.org\r\n" + 
				"8. Patients like me. www.patientslikeme.com\r\n" + 
				"9. Spot crime. http://www.spotcrime.com/\r\n" + 
				"10. Virtuoso. http://virtuoso.openlinksw.com\r\n" + 
				"11. Yago. http://www.mpi-inf.mpg.de/departments/\r\n" + 
				"databases-and-information-systems/research/\r\n" + 
				"yago-naga/yago/\r\n" + 
				"12. Agrawal, S., Chaudhuri, S., Das, G.: Dbxplorer: A system\r\n" + 
				"for keyword-based search over relational databases. In:\r\n" + 
				"ICDE, pp. 5{16 (2002)\r\n" + 
				"13. Battle, R., Kolas, D.: Enabling the geospatial semantic\r\n" + 
				"web with parliament and geosparql. Semantic Web 3(4),\r\n" + 
				"355{370 (2012)\r\n" + 
				"14. Bikakis, N., Giannopoulos, G., Liagouris, J., Skoutas, D.,\r\n" + 
				"Dalamagas, T., Sellis, T.: Rdivf: Diversifying keyword\r\n" + 
				"search on RDF graphs. In: TPDL, pp. 413{416 (2013)\r\n" + 
				"15. Brodt, A., Nicklas, D., Mitschang, B.: Deep integration\r\n" + 
				"of spatial query processing into native RDF triple stores.\r\n" + 
				"In: SIGSPATIAL, pp. 33{42 (2010)\r\n" + 
				"16. Cappellari, P., Virgilio, R.D., Maccioni, A., Roantree,\r\n" + 
				"M.: A path-oriented RDF index for keyword search query\r\n" + 
				"processing. In: DEXA, pp. 366{380 (2011)\r\n" + 
				"17. Cheng, J., Huang, S., Wu, H., Fu, A.W.: Tf-label:\r\n" + 
				"a topological-folding labeling scheme for reachability\r\n" + 
				"querying in a large graph. In: SIGMOD, pp. 193{204\r\n" + 
				"(2013)\r\n" + 
				"18. Cohen, S., Mamou, J., Kanza, Y., Sagiv, Y.: Xsearch: A\r\n" + 
				"semantic search engine for XML. In: VLDB, pp. 45{56\r\n" + 
				"(2003)\r\n" + 
				"19. Dalvi, B.B., Kshirsagar, M., Sudarshan, S.: Keyword\r\n" + 
				"search on external memory data graphs. PVLDB 1(1),\r\n" + 
				"1189{1204 (2008)\r\n" + 
				"20. Elbassuoni, S., Blanco, R.: Keyword search over RDF\r\n" + 
				"graphs. In: CIKM, pp. 237{242 (2011)\r\n" + 
				"21. Elbassuoni, S., Ramanath, M., Schenkel, R., Weikum,\r\n" + 
				"G.: Searching RDF graphs with SPARQL and keywords.\r\n" + 
				"IEEE Data Eng. Bull. 33(1), 16{24 (2010)\r\n" + 
				"22. Fagin, R., Lotem, A., Naor, M.: Optimal aggregation algorithms for middleware. In: PODS (2001)\r\n" + 
				"23. Fu, H., Anyanwu, K.: Effectively interpreting keyword\r\n" + 
				"queries on RDF databases with a rear view. In: ISWC,\r\n" + 
				"pp. 193{208 (2011)\r\n" + 
				"24. Giannopoulos, G., Biliri, E., Sellis, T.: Personalizing keyword search on RDF data. In: TPDL, pp. 272{278 (2013)\r\n" + 
				"25. Guo, L., Shao, F., Botev, C., Shanmugasundaram, J.:\r\n" + 
				"XRANK: ranked keyword search over XML documents.\r\n" + 
				"In: SIGMOD, pp. 16{27 (2003)\r\n" + 
				"26. Guttman, A.: R-trees: A dynamic index structure for spatial searching. In: SIGMOD, pp. 47{57 (1984)\r\n" + 
				"27. Halaschek-Wiener, C., Aleman-Meza, B., Arpinar, I.B.,\r\n" + 
				"Sheth, A.P.: Discovering and ranking semantic associations over a large RDF metabase. In: VLDB, pp. 1317{\r\n" + 
				"1320 (2004)\r\n" + 
				"28. Han, S., Zou, L., Yu, J.X., Zhao, D.: Keyword search on\r\n" + 
				"RDF graphs - A query graph assembly approach. In:\r\n" + 
				"CIKM, pp. 227{236 (2017)\r\n" + 
				"29. He, H., Wang, H., Yang, J., Yu, P.S.: BLINKS: ranked\r\n" + 
				"keyword searches on graphs. In: SIGMOD, pp. 305{316\r\n" + 
				"(2007)\r\n" + 
				"30. Hendler, J.A., Holm, J., Musialek, C., Thomas, G.: US\r\n" + 
				"government linked open data: Semantic.data.gov. IEEE\r\n" + 
				"Intelligent Systems 27(3), 25{31 (2012)\r\n" + 
				"31. Hjaltason, G.R., Samet, H.: Distance browsing in spatial\r\n" + 
				"databases. ACM Trans. Database Syst. 24(2), 265{318\r\n" + 
				"(1999)\r\n" + 
				"32. Hoffart, J., Suchanek, F.M., Berberich, K., Weikum, G.:\r\n" + 
				"YAGO2: A spatially and temporally enhanced knowledge\r\n" + 
				"base from wikipedia. Artif. Intell. 194, 28{61 (2013)\r\n" + 
				"33. Hristidis, V., Gravano, L., Papakonstantinou, Y.: Efficient ir-style keyword search over relational databases.\r\n" + 
				"In: VLDB, pp. 850{861 (2003)\r\n" + 
				"34. Hristidis, V., Papakonstantinou, Y.: DISCOVER: keyword search in relational databases. In: VLDB, pp. 670{\r\n" + 
				"681 (2002)\r\n" + 
				"35. Inglis, J.: Inverted indexes and multi-list structures.\r\n" + 
				"Comput. J. 17(1), 59{63 (1974)\r\n" + 
				"36. Jiang, H., Wang, H., Yu, P.S., Zhou, S.: Gstring: A novel\r\n" + 
				"approach for efficient search in graph databases. In:\r\n" + 
				"ICDE, pp. 566{575 (2007)\r\n" + 
				"37. Jin, R., Ruan, N., Dey, S., Yu, J.X.: SCARAB: scaling\r\n" + 
				"reachability computation on large graphs. In: SIGMOD,\r\n" + 
				"pp. 169{180 (2012)\r\n" + 
				"38. Jin, R., Ruan, N., Xiang, Y., Wang, H.: Path-tree: An\r\n" + 
				"efficient reachability indexing scheme for large directed\r\n" + 
				"graphs. ACM Trans. Database Syst. 36(1), 7 (2011)\r\n" + 
				"39. Kacholia, V., Pandit, S., Chakrabarti, S., Sudarshan, S.,\r\n" + 
				"Desai, R., Karambelkar, H.: Bidirectional expansion for\r\n" + 
				"keyword search on graph databases. In: VLDB, pp. 505{\r\n" + 
				"516 (2005)\r\n" + 
				"40. Koubarakis, M., Kyzirakos, K.: Modeling and querying\r\n" + 
				"metadata in the semantic sensor web: The model strdf\r\n" + 
				"and the query language stsparql. In: ESWC, pp. 425{439\r\n" + 
				"(2010)\r\n" + 
				"41. Kyzirakos, K., Karpathiotakis, M., Koubarakis, M.: Strabon: A semantic geospatial DBMS. In: ISWC, pp. 295{\r\n" + 
				"311 (2012)\r\n" + 
				"42. Le, W., Li, F., Kementsietsidis, A., Duan, S.: Scalable\r\n" + 
				"keyword search on large RDF data. TKDE 26(11), 2774{\r\n" + 
				"2788 (2014)\r\n" + 
				"43. Leskovec, J., Faloutsos, C.: Sampling from large graphs.\r\n" + 
				"In: KDD, pp. 631{636 (2006)\r\n" + 
				"44. Liagouris, J., Mamoulis, N., Bouros, P., Terrovitis, M.:\r\n" + 
				"An effective encoding scheme for spatial RDF data.\r\n" + 
				"PVLDB 7(12), 1271{1282 (2014)\r\n" + 
				"45. Lian, X., Hoyos, E.D., Chebotko, A., Fu, B., Reilly, C.:\r\n" + 
				"k-nearest keyword search in RDF graphs. J. Web Sem.\r\n" + 
				"22, 40{56 (2013)\r\n" + 
				"46. Libkin, L., Reutter, J.L., Soto, A., Vrgoc, D.: Trial: A\r\n" + 
				"navigational algebra for RDF triplestores. ACM Trans.\r\n" + 
				"Database Syst. 43(1), 5:1{5:46 (2018)\r\n" + 
				"47. Lin, X., Ma, Z., Yan, L.: RDF keyword search using a\r\n" + 
				"type-based summary. J. Inf. Sci. Eng. 34(2), 489{504\r\n" + 
				"(2018)\r\n" + 
				"48. Liu, Z., Wang, C., Chen, Y.: Keyword search on temporal\r\n" + 
				"graphs. In: ICDE, pp. 1807{1808 (2018)\r\n" + 
				"49. Neumann, T., Weikum, G.: RDF-3X: a risc-style engine\r\n" + 
				"for RDF. PVLDB 1(1), 647{659 (2008)\r\n" + 
				"50. Papadias, D., Zhang, J., Mamoulis, N., Tao, Y.: Query\r\n" + 
				"processing in spatial network databases. In: VLDB, pp.\r\n" + 
				"802{813 (2003)\r\n" + 
				"51. Peng, P., Zou, L., Qin, Z.: Answering top-k query combined keywords and structural queries on RDF graphs.\r\n" + 
				"Inf. Syst. 67, 19{35 (2017)\r\n" + 
				"52. Ponte, J.M., Croft, W.B.: A language modeling approach\r\n" + 
				"to information retrieval. In: SIGIR, pp. 275{281 (1998)\r\n" + 
				"53. Prud’Hommeaux, E., Seaborne, A., et al.: Sparql query\r\n" + 
				"language for rdf. W3C recommendation 15 (2008)\r\n" + 
				"54. van Schaik, S.J., de Moor, O.: A memory efficient reachability data structure through bit vector compression. In:\r\n" + 
				"SIGMOD, pp. 913{924 (2011)\r\n" + 
				"55. Shasha, D., Wang, J.T.L., Giugno, R.: Algorithmics and\r\n" + 
				"applications of tree and graph searching. In: PODS, pp.\r\n" + 
				"39{52 (2002)\r\n" + 
				"56. Shi, J., Wu, D., Mamoulis, N.: Top-k relevant semantic\r\n" + 
				"place retrieval on spatial RDF data. In: SIGMOD, pp.\r\n" + 
				"1977{1990 (2016)\r\n" + 
				"57. Tran, T., Wang, H., Rudolph, S., Cimiano, P.: Top-k exploration of query candidates for efficient keyword search\r\n" + 
				"on graph-shaped (RDF) data. In: ICDE, pp. 405{416\r\n" + 
				"(2009)\r\n" + 
				"58. Wang, C., Ku, W., Chen, H.: Geo-store: a spatiallyaugmented SPARQL query evaluation system. In:\r\n" + 
				"SIGSPATIAL, pp. 562{565 (2012)\r\n" + 
				"59. Wang, D., Zou, L., Feng, Y., Shen, X., Tian, J., Zhao,\r\n" + 
				"D.: S-store: An engine for large RDF graph integrating\r\n" + 
				"spatial information. In: DASFAA, pp. 31{47 (2013)\r\n" + 
				"60. Wang, D., Zou, L., Zhao, D.: gst-store: An engine for large\r\n" + 
				"RDF graph integrating spatiotemporal information. In:\r\n" + 
				"EDBT, pp. 652{655 (2014)\r\n" + 
				"61. Wang, H., Aggarwal, C.C.: A survey of algorithms for\r\n" + 
				"keyword search on graph data. In: Managing and Mining\r\n" + 
				"Graph Data, pp. 249{273 (2010)\r\n" + 
				"62. Wylot, M., Hauswirth, M., Cudr´e-Mauroux, P., Sakr, S.:\r\n" + 
				"RDF data storage and query processing schemes: A survey. ACM Comput. Surv. 51(4), 84:1{84:36 (2018)\r\n" + 
				"63. Yan, X., Yu, P.S., Han, J.: Substructure similarity search\r\n" + 
				"in graph databases. In: SIGMOD, pp. 766{777 (2005)\r\n" + 
				"64. Yildirim, H., Chaoji, V., Zaki, M.J.: GRAIL: scalable\r\n" + 
				"reachability index for large graphs. PVLDB 3(1), 276{\r\n" + 
				"284 (2010)\r\n" + 
				"65. Zeng, K., Yang, J., Wang, H., Shao, B., Wang, Z.: A distributed graph engine for web scale RDF data. PVLDB\r\n" + 
				"6(4), 265{276 (2013)\r\n" + 
				"66. Zhong, M., Wang, Y., Zhu, Y.: Coverage-oriented diversification of keyword search results on graphs. In: DASFAA, pp. 166{183 (2018)\r\n" + 
				"67. Zou, L., Mo, J., Chen, L., Ozsu, M.T., Zhao, D.: gstore: ¨\r\n" + 
				"Answering SPARQL queries via subgraph matching.\r\n" + 
				"PVLDB 4(8), 482{493 (2011)\r\n";
		
//		replaceForCopyFromWord();
		removeFirst(inputString);
	}
}
