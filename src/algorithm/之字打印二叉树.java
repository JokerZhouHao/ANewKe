import java.util.*;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList();
        if(pRoot == null)    return res;
        LinkedList<TreeNode> queue = new LinkedList();
        ArrayList<Integer> level = new ArrayList();
        queue.add(pRoot);
        queue.add(null);
        boolean isP = true;
        TreeNode node = null;
        while(true){
            node = queue.removeFirst();
            if(node == null){
                if(isP) res.add(level);
                else{
                    Collections.reverse(level);
                    res.add(level);
                }
                isP = !isP;
                level = new ArrayList();
                if(queue.isEmpty())    break;
                else queue.add(null);
            } else{
                level.add(node.val);
                if(node.left != null)    queue.add(node.left);
                if(node.right != null)    queue.add(node.right);
            }
        }
        return res;
    }

}