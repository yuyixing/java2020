package com.yuyx.offer.leetcode;

import com.yuyx.offer.ListNode;

/**
 * 2. 两数相加
 * 给出两个非空的链表用来表示两个非负的整数。其中，它们各自的位数是按照逆序的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字0之外，这两个数都不会以0开头。
 *
 * @author yuyx
 */
public class Question2 {

    /**
     * 初等数学
     * O(max(m,n)) O(max(m,n))
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headPoint = new ListNode();
        ListNode cur = headPoint;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.getVal();
            int y = l2 == null ? 0 : l2.getVal();
            int sum = x + y + carry;

            carry = sum / 10;
            cur.setNext(new ListNode(sum % 10));
            cur = cur.getNext();

            if (l1 != null) {
                l1 = l1.getNext();
            }
            if (l2 != null) {
                l2 = l2.getNext();
            }
        }

        if (carry == 1) {
            cur.setNext(new ListNode(1));
        }

        return headPoint.getNext();
    }
}
