package algorithm;

/*
 * ������������ABC�������ѡ�����ɸ����֣�������Щ���ֱ�����A�ı������������ٵ�ѡ��һ�����֡�

	���Ƿ����һ��ѡ�񷽰�ʹ����Щ���ֵĺͶ�Bȡ��Ľ��ΪC���������YES�������NO
	
	ֻ��c%��gcd��a��b����==0�������yes������no
 */
public class ��������� {
	private int GCD(int a, int b) {
        if(b==0) return a; 
        return a % b == 0 ? b : GCD(b, a % b);
	}
}
