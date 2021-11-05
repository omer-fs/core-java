package omer.assignment.main;

import omer.assignment.data.Data;
import omer.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.display();
        data.displayLocal();

        Singleton singleton = Singleton.setStr("Imran");
        singleton.display();
    }
}
