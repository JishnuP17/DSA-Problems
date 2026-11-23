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
        if(head==null || head.next==null || k==0){
            return head;
        }
        temp = head;int cnt=0;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        k = k%cnt;
        if(k==0){
            return head;
        }
        temp=head;
        ListNode tail;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        temp = head;
        int a = cnt-k;
        int l=1;
        while(l!=a){
            temp = temp.next;
            l++; 
        }
        tail = temp;
        head = tail.next;
        tail.next = null;
        return head;
    }
}