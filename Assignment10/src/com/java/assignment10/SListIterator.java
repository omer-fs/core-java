package com.java.assignment10;

public class SListIterator<T> {
    Node<T> head;
    Node<T> tail;
    public SListIterator() {
        head=null;
        tail=null;
    }

    public void insert(T data){
        Node<T>  newNode = new Node<>(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

    public void delete(T data){
        Node<T>  tempNode = head;
        Node<T> previousNode = null;

        if(head.data == data){
            head = tempNode.next;
            return;
        }

        while(tempNode != null){
            if(tempNode.data == data){
                previousNode.next = tempNode.next;
            }
            previousNode = tempNode;
            tempNode = tempNode.next;
        }
    }

    public void print() {
        Node<T>  tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data+"-->");
            tempNode = tempNode.next;
        }
        System.out.println("Null");
    }
}
