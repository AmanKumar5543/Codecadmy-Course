package polymorphism;

public class Pomegranate extends Fruits {
    public Pomegranate() {
        super("Pomegranate juice", 50, 100, false);
    }

    @Override
    public void menu() {
        System.out.println("Welcome to Aman da Juice Shop ");
        System.out.println("We have " + nameProduct);
        System.out.println("Price of full glass is " + fullPrice);
        System.out.println("Price of half glass is " + halfPrice);
        System.out.println("it is preservable: " + isPreservable);
    }

     public void decreaseInPrice (int reducedPrice){
            this.fullPrice = this.fullPrice - reducedPrice;
        }

    }



