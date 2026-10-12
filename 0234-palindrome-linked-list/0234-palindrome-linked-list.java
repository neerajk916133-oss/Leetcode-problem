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
    public boolean isPalindrome(ListNode head) {
       ArrayList<Integer>list = new ArrayList<>();
       while(head!=null){
        list.add(head.val);
        head= head.next;
       }
       int len = list.size()-1;
       int left =0;
      
       int right =len;
       while(left<right){
        if(!list.get(left).equals(list.get(right))){
            return false;
        }
        left++;
        right--;
       }
       return true;
    }
}    