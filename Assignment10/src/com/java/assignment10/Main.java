package com.java.assignment10;

public class Main {

    public static void main(String[] args) {
        SList<Integer> list = new SList<>();
        SListIterator<Integer> sListIterator = list.iterator();

        // Inserting the nodes in linked list
        sListIterator.insertNode(10);
        sListIterator.insertNode(20);
        sListIterator.insertNode(30);
        sListIterator.insertNode(40);
        sListIterator.insertNode(50);

        sListIterator.printList();

        // Deleting few nodes from list
        sListIterator.deleteNode(40);
        sListIterator.deleteNode(20);

        sListIterator.printList();
    }
}
