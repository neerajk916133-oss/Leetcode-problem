/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode start = head;
        ListNode fast = head;

        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            start = start.next;
            if(fast==start){
                return true;
            }
        }
        return false;
    }
}