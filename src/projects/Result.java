package projects;
import java.util.Scanner;


public class Result {
    public static void main(String[] args) {
//        Scanner num = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int a = num.nextInt();
//          if (a <= 0) {
//            System.out.println("Wrong input");
//        }
//        System.out.println("Enter Second number");
//        int b = num.nextInt();
//           if (b<=0){
//               System.out.println("Wrong input");
//           }
//
//        int c = a+b;
//        System.out.println("The addition of the given two value is "+ c);
//    }
        Scanner info = new Scanner(System.in);
        System.out.println(("Welcome to Aman hotel check in counter").toUpperCase());
        System.out.println("Can i have your name");
        String name  = info.nextLine();
        System.out.println ("Welcome   " + name.toUpperCase());
        System.out.println("May i know your age sir?");
            int age = info.nextInt();
            if (age<18){
                System.out.println("I am Sorry " + name +"You are not eligible to book a hotel on your own.");
            } else {
                System.out.println("Thanks" + name + "Sir .  For helping us out with your age");
            }

        System.out.println("What kind of Room you prefer? \n We have: \n 1.First class \n 2.Second class \n 3.Third class");
            String choice = info.nextLine();
            if (choice == "First class") {
                System.out.println("That would be Rs.10000 per day");
            }else if (choice == "Second class") {
                System.out.println("That would be Rs.5000 per day");
            }else if (choice == "Third class") {
                System.out.println("That would be Rs.3000 per day");
            }else {
                System.out.println("Wrong input");
            }
            System.out.println(("So your name is " + name + " .  your age is "+ age).toUpperCase());
        }
    }


