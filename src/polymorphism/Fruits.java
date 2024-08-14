package polymorphism;
public class Fruits {           //This is a parent class and below it we will create child class for now
    public void menu() { //This is a method we will use for polymorphism
        System.out.println("Aman Fruit Juice Shop Menu");
    }

    // Now We create child class  named Apple
    public static class Apple extends Fruits {
        @Override
        public void menu() { //Here we are using override to use the same method of parent class in our child class
            System.out.println("Apple juice onr Full glass 60");
            System.out.println("Apple juice half glass Rs 30");
        }

    }


    // Now we will make two more child class
    public static class Orange extends Fruits {
        @Override
        public void menu() { //Here we are using override to use the same method of parent class in our child class
            System.out.println("Orange juice one Full glass 50");
            System.out.println("Orange juice half glass Rs 30");
        }

    }

    public static class Banana extends Fruits {
        @Override
        public void menu() { //Here we are using override to use the same method of parent class in our child class
            System.out.println("Banana Shake onr Full glass 80");
            System.out.println("Banana Shake half glass Rs 40");
        }
    }
}



