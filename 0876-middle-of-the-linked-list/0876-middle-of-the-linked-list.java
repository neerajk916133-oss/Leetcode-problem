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
    public ListNode middleNode(ListNode head) {
        ListNode start = head;
        ListNode ok = new ListNode(-1);
        int count =0;
       
        while(head!=null){
            head = head.next;
            count++;
        }
        int mid = count/2;
        int i =0;
        while(start!=null){
            if(i==mid){

                return start;
             }

                start = start.next;
                i++;

        }
        return ok.next;
    }
}