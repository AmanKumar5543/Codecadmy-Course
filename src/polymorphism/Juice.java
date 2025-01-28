package polymorphism;

import polymorphism.Fruits;


public class Juice{
    public static void main(String[] args) {
        Fruits juice1 = new Apple();
        juice1.menu();
      //  System.out.println(juice1.nameProduct);
        Fruits juice2 = new Banana();
        juice2.menu();
       // System.out.println(juice2.nameProduct);
        Fruits juice3 = new Orange();
        juice3.menu();
       // System.out.println(juice3.nameProduct);
        Pomegranate juice4 = new Pomegranate();
        juice4.decreaseInPrice(45);
        juice4.menu();

    }

}



