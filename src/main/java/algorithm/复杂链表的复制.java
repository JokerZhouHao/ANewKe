/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
import java.util.*;

public class Solution {
    private void cloneNodes(RandomListNode  pHead) {
        RandomListNode p = pHead, p1 = null;
        while(p != null){
            p1 = new RandomListNode(p.label);
            p1.next = p.next;
            p.next = p1;
            p = p1.next;
        }
    }
    
    private void connectRandom(RandomListNode  pHead) {
        RandomListNode p = pHead, p1 = null;
        while(p != null){
            p1 = p.next;
            if(p.random != null)    p1.random = p.random.next;
            p = p1.next;
        }
    }
    
    private RandomListNode splitList(RandomListNode  pHead) {
        RandomListNode p = pHead, p1 = p.next, head = p1;
        while(p != null){
            p1 = p.next;
            p.next = p1.next;
            if(p1.next != null){
                p1.next = p1.next.next;
            }    
            p = p.next;
        }
        return head;
    }
    
    
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null)    return null;
        cloneNodes(pHead);
        connectRandom(pHead);
        return splitList(pHead);
    }
}