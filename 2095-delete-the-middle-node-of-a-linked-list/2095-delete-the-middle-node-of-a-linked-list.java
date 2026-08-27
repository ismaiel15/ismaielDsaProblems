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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int i = 1;
        int j = 1;
        ListNode temp = head;
        if(head.next ==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            i++;
        }
       while(j<i-1){
        temp = temp.next;
        j++;
       }
       temp.next = slow.next;


        

        return head;
        
    }
}