/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode frontFirst(TreeLinkNode pNode){
        if(pNode.left != null)    return frontFirst(pNode.left);
        else return pNode;
    }
    
    public TreeLinkNode upFirst(TreeLinkNode pNode){
        TreeLinkNode prNode = pNode.next;
        if(prNode == null)    return null;
        else{
            if(prNode.left == pNode)    return prNode;
            else return upFirst(prNode);
        }
    }
    
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right != null)    return frontFirst(pNode.right);
        else return upFirst(pNode);
    }
}