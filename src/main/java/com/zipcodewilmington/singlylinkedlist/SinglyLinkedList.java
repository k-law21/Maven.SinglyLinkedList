package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

        static Node head;
        static Node tail;
        static int size = 0;

        public void add(Integer info) {
                size++;
                if (head == null) {
                        head = new Node(null, null, info);
                        tail = head;
                } else {
                        Node node = new Node(head, null, info);
                        head.prev = node;
                        this.head = node;
                }
        }

        public static void remove(Integer info) {
                if (head != null) {
                        size--;
                        if (tail.prev != null) {
                                tail.prev.next = null;
                                tail = tail.prev;
                        } else {
                                head = null;
                                tail = null;
                        }
                }
        }



        public static int find(Integer num) {
                int index = 0;
                if (num == null) {
                        for (Node x = head; x != null; x = x.next) {
                                if (x.getData() == null) {
                                        return index;
                                }
                                index++;
                        }
                } else {
                        for (Node x = head; x != null; x = x.next) {
                                if (num.equals(x.getData())) {
                                        return index;
                                }
                                index++;
                        }
                }
                return -1;
        }

        public Boolean contains(Integer num) {
                return null;
        }
        public Integer size() {
                return this.size;
        }
        public SinglyLinkedList copy() {
                SinglyLinkedList newList = new SinglyLinkedList();
                Node node = head;
                while (node != null) {
                        newList.add(node.getData());
                        node = node.getNext();

                }

                return newList;
        }
}