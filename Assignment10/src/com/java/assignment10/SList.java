package com.java.assignment10;

public class SList<T> {

    public SListIterator<T> iterator() {
        return new SListIterator<>();
    }
}