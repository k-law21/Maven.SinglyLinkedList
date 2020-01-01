package com.zipcodewilmington.singlylinkedlist;

public class Node {
        private Node next;
        private Node prev;
        private Integer data;

     public Node(Node next , Node prev , Integer data) {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
     public void setData (Integer data){ this.data = data;}

     public void setNext (Node node){next = node;}

     public void setPrev (Node node){ prev = node;}

     public Integer  getData (){return data;}

     public Node getNext (){return next;}

     public Node getPrev (){return prev;}




}
