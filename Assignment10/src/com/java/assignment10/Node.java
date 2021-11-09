package com.java.assignment10;

public class Node<T> {
    public T value;
    Node<T> next;

    public Node(T value)  {
        this.value=value;
        next=null;
    }
}
