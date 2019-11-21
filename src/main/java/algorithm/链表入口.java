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

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode p1 = pHead, p2 = pHead;
        while(p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2)    break;
        }
        if(p2.next == null || p2.next.next == null)    return null;
        
        p1 = pHead;
        if(p1 == p2)    return p1;
        while(p1.next != p2.next){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.next;
    }
}