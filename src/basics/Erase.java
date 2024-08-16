package basics;

import java.util.Scanner;

public class Erase {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = info.nextLine();
        System.out.println("Thanks for your input. Your input has been saved");
        System.out.println(("Enter your age").toUpperCase());
        int age = info.nextInt();
        if (age<25){
            System.out.println("You are not eligible . Please don't fill the form further .It will be Rejected");
        }else {
            System.out.println("Thanks for your input. Your input has been saved");
        }
        System.out.println(("Are you employed?  Answer in true or false").toUpperCase());
        boolean isEmployed= info.nextBoolean();
        if (isEmployed){
            System.out.println("Thanks for your input. Your input has been saved");
        }else{
            System.out.println("You are not eligible.Please don,t fill the form further");
        }
        System.out.println(("How much is your active income?").toUpperCase());
        double income = info.nextDouble();
        if (income >= 50000){
            System.out.println("Thanks for your input. Your input has been saved");
        }else{
            System.out.println("We don't have any customer. Who will be interested in you");
        }
        System.out.println("Thanks for filling up the form . Please check your details one more time ");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Employed : " + isEmployed);
        System.out.println("Income : " + income);
        System.out.println("We will give you a call shortly");
    }
}
