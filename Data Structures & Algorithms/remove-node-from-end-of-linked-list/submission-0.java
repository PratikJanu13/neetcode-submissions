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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c = 0;
        ListNode node = head;
        while(node != null){
            node = node.next;
            c++;
        }
        if(c == n){
            return head.next;
        }
        int break_point = c-n;
        ListNode temp2 = head;
        for(int i=0; i<break_point-1; i++){
            temp2 = temp2.next;
        }
        temp2.next = temp2.next.next;

        return head;

        
    }
}
