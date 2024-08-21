package polymorphism;

import polymorphism.Fruits;


public class Juice{
    public static void main(String[] args) {
        Apple juice1 = new Apple();
        juice1.menu();
      //  System.out.println(juice1.nameProduct);
        Banana juice2 = new Banana();
        juice2.menu();
       // System.out.println(juice2.nameProduct);
        Orange juice3 = new Orange();
        juice3.menu();
       // System.out.println(juice3.nameProduct);
    }

}



