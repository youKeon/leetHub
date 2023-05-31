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
        int size = 0;
        ListNode node = head;
        while(node != null) {
            node = node.next;
            size++;
        }
        
        node = head;
        int mid = size / 2 + 1;
        for (int i = 1; i < mid; i++) {
            node = node.next;
        }
        return node;
    }
}