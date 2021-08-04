package com.deepocean.algorithm;

public class LinkedListDemo2 {
    public static void main(String []args) {
        ListNode ln = new ListNode();
        ln.value = 1;
        ListNode ln2 = new ListNode();
        ln2.value = 2;
        ln.next = ln2;
        ListNode target = reverseList(ln);
        System.out.println(target.value);
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

class ListNode {
    int value;
    ListNode next;
}
