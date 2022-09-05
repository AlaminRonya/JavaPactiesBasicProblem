package com.al_amin.link_list;

class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class Solution {
    public static ListNode getNode(int v, ListNode head){
        ListNode node = new ListNode();
        node.val = v;
        node.next =  head;
        return node;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode node = null;
        int tmp = 0;
        while (l1 != null || l2 != null){

            int a = (l1 != null)? l1.val : 0;
            int b = (l2 != null)? l2.val : 0;
            int s = a+b+tmp;
            tmp = s/10;
            if (node == null){
                node = new ListNode(s%10, null);
                head = node;
            }else {
                while (node != null){
                    node = node.next;
                }
                node.next = new ListNode(s%10, node);
            }

            l1 = (l1 != null)? l1.next : null;
            l2 = (l2 != null)? l2.next : null;
        }
        if (tmp != 0){
            node = new ListNode(tmp, node);
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = null;
        head = getNode(1, head);
        head = getNode(2, head);
        head = getNode(3, head);
        addTwoNumbers(head, head);

    }
}
