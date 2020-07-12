package com.yuyx.offer;

import java.util.Stack;

/**
 * 从尾到头打印链表
 *
 * @author yuyx
 */
public class Offer06 {
    private int count = 0;
    private int[] arr;
    private int lastIndex;

    /***
     * recursive
     * O(n) O(n)
     */
    public int[] reversePrint0104(ListNode head) {
        if (head == null) {
            arr = new int[count];
            return arr;
        }
        count++;
        reversePrint0104(head.getNext());
        arr[arr.length - count--] = head.getVal();
        return arr;
    }

    /***
     * recursive
     * O(n) O(n)
     */
    public int[] reversePrint0101(ListNode head) {
        if (paramsInvalid(head)) {
            return new int[0];
        }

        recursive(head, 0);

        return arr;
    }

    private void recursive(ListNode curNode, int count) {
        if (curNode == null) {
            arr = new int[count];
            lastIndex = count - 1;
            return;
        }
        recursive(curNode.getNext(), count + 1);
        arr[lastIndex - count] = curNode.getVal();
    }

    /**
     * Array
     * O(n) O(n)
     */
    public int[] reversePrint0102(ListNode head) {
        if (paramsInvalid(head)) {
            return new int[0];
        }

        int count = 0;
        ListNode curNode = head;
        while (curNode != null) {
            count++;
            curNode = curNode.getNext();
        }
        int[] reverseArray = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            reverseArray[i] = head.getVal();
            head = head.getNext();
        }

        return reverseArray;
    }

    /**
     * Stack
     * O(n) O(n)
     */
    public int[] reversePrint0103(ListNode head) {
        if (paramsInvalid(head)) {
            return new int[0];
        }

        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.getVal());
            head = head.getNext();
        }
        int[] ints = new int[stack.size()];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = stack.pop();
        }

        return ints;
    }

    private boolean paramsInvalid(ListNode listNode) {
        return listNode == null;
    }
}
