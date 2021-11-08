package com.java.assignment10;

public class Node<T> {
    public T data;
    Node<T> next;

    public Node(T data)
    {
        this.data=data;
        next=null;
    }
}
