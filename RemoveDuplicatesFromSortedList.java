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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> data = new HashSet<>();
        LinkedList<Integer> uniqueValues = new LinkedList<>();

        ListNode temp = head;
        while (temp != null) {
            if (!data.contains(temp.val)) {
                data.add(temp.val);
                uniqueValues.add(temp.val);
            }
            temp = temp.next;
        }
        if (uniqueValues.isEmpty()) {
            return null;
        }

        ListNode res_head = new ListNode(uniqueValues.get(0));
        ListNode current = res_head;

        for (int i = 1; i < uniqueValues.size(); i++) {
            current.next = new ListNode(uniqueValues.get(i));
            current = current.next;
        }

        return res_head;
    }
}