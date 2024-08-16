package polymorphism;

import polymorphism.Fruits;

public class Apple extends Fruits{
    public Apple (){
        super("Apple juice",20,40,false);

    }
    @Override
    public void menu(){
        System.out.println("Welcome to Aman da Juice Shop ");
        System.out.println("We have :" + nameProduct);
        System.out.println("Price of full glass is Rs."+ fullPrice);
        System.out.println("Price of half glass is Rs."+ halfPrice);
        System.out.println("it is preservable:" + isPreservable);
    }



}
