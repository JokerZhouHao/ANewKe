package algorithm;

public class �������OR��С��� {
		public int run(TreeNode root) {
	        if(null == root)    return 0;
	        if(root.left == null) return run(root.right) + 1;
	        if(root.right == null) return run(root.left) + 1;
	        int lN = run(root.left) + 1;
	        int rN = run(root.right) + 1;
	        return lN<rN?lN:rN; // ��������
			return lN>rN?lN:rN; // ����С���
	}
}
