package algorithm;

public class 树的最大OR最小深度 {
		public int run(TreeNode root) {
	        if(null == root)    return 0;
	        if(root.left == null) return run(root.right) + 1;
	        if(root.right == null) return run(root.left) + 1;
	        int lN = run(root.left) + 1;
	        int rN = run(root.right) + 1;
	        return lN<rN?lN:rN; // 求最大深度
			return lN>rN?lN:rN; // 求最小深度
	}
}
