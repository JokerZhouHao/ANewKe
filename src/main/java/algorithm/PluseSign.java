package algorithm;

public class PluseSign {
	private final int SIGN_INVALID = -1;
	private final int SIGN_POINT = 0;
	private final int SIGN_STAR = 1;
	private final int SIGN_CROSS = 2;
	
	/*
	 * 判定是否是形状 	*		* *		 *		* *
	 * 				* *		*	   * *		  *
	 * 
	 *  			*	  * * *		 *		* * *
	 * 			  * * *		*	   * * *	  *
	 */
	private boolean isInvalid(int[][] matrix, int i, int j) {
		int n1 = 0, n2 = 0;
		if((j-1) >= 0 && matrix[i][j - 1] == SIGN_STAR)	n1++;
		if((j+1) < matrix[0].length && matrix[i][j + 1] == SIGN_STAR)	n1++;
		
		if((i-1) >= 0 && matrix[i-1][j] == SIGN_STAR)	n2++;
		if((i+1) < matrix.length && matrix[i+1][j] == SIGN_STAR)	n2++;
		
		if(n1 + n2 == 0 || n1 + n2 == 1)	return false;
		else if(n1 + n2 == 4) {
			matrix[i][j] = SIGN_CROSS;
			return false;
		} else if(n1 + n2 == 2) {
			if(n1 == 2 || n2 == 2)	return false;
			else return true;
		} else return true;
	}
	
	private void setInvalid(int[][] matrix, int i, int j) {
		if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length)	return;
		if(matrix[i][j] == SIGN_STAR || matrix[i][j] == SIGN_CROSS) {
			matrix[i][j] = SIGN_INVALID;
			setInvalid(matrix, i, j - 1);
			setInvalid(matrix, i - 1, j);
			setInvalid(matrix, i, j + 1);
			setInvalid(matrix, i + 1, j);
		}
	}
	
	private boolean isAdd(int[][] matrix, int i, int j) {
		int p = 0;
		p = i - 2;
		while(p >= 0) {
			if(matrix[p][j] == SIGN_INVALID || matrix[p][j] == SIGN_CROSS)	return false;
			else if(matrix[p][j] == SIGN_POINT)	break;
			p--;
		}
		p = i + 2;
		while(p < matrix.length) {
			if(matrix[p][j] == SIGN_INVALID || matrix[p][j] == SIGN_CROSS)	return false;
			else if(matrix[p][j] == SIGN_POINT)	break;
			p++;
		}
		p = j - 2;
		while(p >= 0) {
			if(matrix[i][p] == SIGN_INVALID || matrix[i][p] == SIGN_CROSS)	return false;
			else if(matrix[i][p] == SIGN_POINT)	break;
			p--;
		}
		p = j + 2;
		while(p < matrix[0].length) {
			if(matrix[i][p] == SIGN_INVALID || matrix[i][p] == SIGN_CROSS)	return false;
			else if(matrix[i][p] == SIGN_POINT)	break;
			p++;
		}
		return true;
	}
	
	/*
	 * 判断是否只有一个“ + ”
	 */
	public boolean hasOnly1Add(int[][] matrix) {
		int i, j;
		for(i = 0; i<matrix.length; i++) {
			for(j = 0; j<matrix[0].length; j++) {
				if(matrix[i][j] == SIGN_STAR && isInvalid(matrix, i, j))
					// 凡是与无效区域相连的地方，都是无效的
					setInvalid(matrix, i, j);
			}
		}
		
		int numAdd = 0;
		for(i = 1; i<matrix.length - 1; i++) {
			for(j = 1; j<matrix[0].length - 1; j++) {
				if(matrix[i][j] == SIGN_CROSS) {
					if(isAdd(matrix, i, j)) {
						numAdd++;
						if(numAdd > 1)	return false;
					} else setInvalid(matrix, i, j);
				}
			}
		}
		if(numAdd == 1)	return true;
		else return false;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {
				{0,1,0,0,1,0,0,1,0},
				{1,1,1,1,1,1,1,1,1},
				{0,1,0,0,0,0,0,1,0}
		};
		System.out.println(new PluseSign().hasOnly1Add(matrix));
	}
}
