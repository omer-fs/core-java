package com.java.assignment10;

public class SList<T> {
    //public Node<T> head;

    public SListIterator<T> iterator()
    {
        return new SListIterator<>();
    }
}