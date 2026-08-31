/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode findTail(int k,ListNode head){
        ListNode newTemp = head;
        int i=1;
        while(i<k){
            newTemp = newTemp.next;
            i++;
        }
        return newTemp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode oldHead = head;
        int length = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            length ++;
        }
        if(k%length==0){
            return head;
        }
         k = k%length;
         ListNode newTail = findTail(length-k,head);
         head=newTail.next;
         newTail.next = null;
         tail.next = oldHead;

            return head;
        
    }

}