package polymorphism;

import polymorphism.Fruits;


public class Juice extends Fruits{
    public static void main(String[] args) {
        Fruits juice1 = new Fruits();
        Apple juice2 = new Apple();
        Banana juice3 = new Banana();
        Orange juice4 = new Orange();
        juice1.menu();
        juice2.menu();
        juice3.menu();
        juice4.menu();

    }
}