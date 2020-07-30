/**
 * 
 */
package com.epam.algo.ds.linkedList;

/**
 * @author Akansh_Rai
 *         https://leetcode.com/problems/odd-even-linked-list/submissions/
 */
public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return head;
		int len = 1;

		ListNode last = head;
		while (last.next != null) {
			len++;
			last = last.next;
		}

		if (len == 1 || len == 2)
			return head;

		len /= 2;

		ListNode left = head;
		while (len-- > 0) {
			ListNode nextNode = left.next;
			left.next = nextNode.next;
			left = left.next;
			nextNode.next = null;
			last.next = nextNode;
			last = nextNode;
		}

		return head;
	}
}
