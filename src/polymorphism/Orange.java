package polymorphism;

import polymorphism.Fruits;

public class Orange extends Fruits{
    public Orange (){
        super("Orange Juice",40,85,true);

    }
    @Override
    public void menu(){
        System.out.println("Welcome to Aman da Juice Shop");
        System.out.println("We have :" + nameProduct);
        System.out.println("Price of full glass is Rs."+ fullPrice);
        System.out.println("Price of half glass is RS."+ halfPrice);
        System.out.println("it is preservable:" + isPreservable);
    }}
