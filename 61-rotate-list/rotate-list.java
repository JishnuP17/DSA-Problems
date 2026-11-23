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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp;
        if(head==null || head.next==null){
            return head;
        }
        temp = head;int cnt=0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        k = k%cnt;
        while(k!=0){
            temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next.next = head;
            head = temp.next;
            temp.next = null;
            k = k-1;
        }
        return head;

        
    }
}