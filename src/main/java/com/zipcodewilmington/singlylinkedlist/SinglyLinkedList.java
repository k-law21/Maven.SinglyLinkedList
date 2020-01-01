package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

        Node head;
        Node tail;
        int size = 0;

        public static void add(Integer info) {
        }

        public static void remove(Integer info) {
        }

        public static void find(Integer number) {
        }

        public Boolean contains(Integer num) {
                return null;
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