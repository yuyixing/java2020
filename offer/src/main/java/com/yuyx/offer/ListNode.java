package com.yuyx.offer;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 *
 * @author yuyx
 */
public class ListNode {

    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createListNodeWithInts(int[] ints) {
        if (ints == null || ints.length == 0) {
            return null;
        }

        ListNode listNode = null;
        ListNode curNode = null;
        for (int anInt : ints) {
            if (listNode == null) {
                curNode = new ListNode(anInt);
                listNode = curNode;
            } else {
                curNode.setNext(new ListNode(anInt));
                curNode = curNode.getNext();
            }
        }

        return listNode;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.getNext() != null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
