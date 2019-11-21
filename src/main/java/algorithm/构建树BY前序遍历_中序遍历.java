package algorithm;

public class 构建树BY前序遍历_中序遍历 {
	public TreeNode construct(int[] a, int aStart, int aEnd, int[] b, int bStart, int bEnd){
        if(aStart > aEnd || bStart > bEnd)    return null;
        TreeNode root = new TreeNode(a[aStart]);
        int pivot = 0;
        for(pivot=bStart; pivot<=bEnd; pivot++)
            if(a[aStart] == b[pivot])    break;
        root.left = construct(a, aStart+1, aStart + pivot - bStart, b, bStart, pivot-1);
        root.right = construct(a, aStart + pivot - bStart + 1, aEnd, b, pivot + 1, bEnd);
        return root;
    }
    
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(null == pre)    return null;
        return construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

}
