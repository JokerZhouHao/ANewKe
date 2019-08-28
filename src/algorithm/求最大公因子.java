package algorithm;

/*
 * 给出三个数字ABC，你可以选择若干个数字，但是这些数字必须是A的倍数，并且至少得选择一个数字。

	问是否存在一种选择方案使得这些数字的和对B取余的结果为C，存在输出YES否则输出NO
	
	只有c%（gcd（a，b））==0才能输出yes，否则no
 */
public class 求最大公因子 {
	private int GCD(int a, int b) {
        if(b==0) return a; 
        return a % b == 0 ? b : GCD(b, a % b);
	}
}
