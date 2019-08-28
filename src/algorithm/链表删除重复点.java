/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null)    return null;
        ListNode head = new ListNode(pHead.val + 1);
        ListNode p = head, p1;
        head.next = pHead;
        while(null != p.next && p.next.next != null){
            if(p.next.val == p.next.next.val){
                p1 = p.next.next;
                while(null != p1.next){
                    if(p1.val != p1.next.val)    break;
                    p1 = p1.next;
                }
                p.next = p1.next;
            } 
            else p = p.next;
        }
        return head.next;
    }
}