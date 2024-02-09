package Models;

import Service.Printable;
import Service.Stateable;

public class SuperCat extends Cat implements Printable, Stateable {

    public SuperCat(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void print() {
        System.out.println("Super Cat printed");
    }

    @Override
    public void printState(int n) {
        System.out.println(n);
    }
}
