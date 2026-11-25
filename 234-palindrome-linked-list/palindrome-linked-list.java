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
        ListNode slow,fast;
        slow = head;
        fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow;
        ListNode temp = head1;
        ListNode curr = head1;
        ListNode prev = null;
        ListNode n;
        while(curr!=null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        head1 = prev;
        ListNode temp1 = head;
        while(temp1!=temp){
            if(temp1.val!=head1.val){
                return false;
            }
            temp1 = temp1.next;
            head1 = head1.next;
        }
        return true;
    }
}