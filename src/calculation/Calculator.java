package calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a calculator".toUpperCase());
        System.out.println("Enter two numbers");
        System.out.println("Choose the operation you want to perform \n 1. +  \n 2. - \n 3. * \n 4. / \n ");
        System.out.println("Enter first number");
        try {
            int a = input.nextInt();
            System.out.println("Enter the Second number");
            int b = input.nextInt();
            System.out.println("Choose the mode of operation as per its index".toUpperCase());

        int c = input.nextInt();
        if (c == 1) {
            System.out.println("The sum is ".toUpperCase() + (a+b));
    } else if (c == 2) {
            System.out.println("The difference is ".toUpperCase() +(a-b));
        } else if (c==3) {
            System.out.println("The product is ".toUpperCase() + (a*b));
        } else if (c==4)
              if (b==0) {                                                 //Here i have used nested if else statement
                  System.out.println("Denominator can't be zero");
               }else {
            System.out.println("Division is ".toUpperCase() +(a/b));
        } else {
            System.out.println("wrong input");
        }
        }
        catch (InputMismatchException e){
            System.err.println("You can't put any other input than integers");
        }

    }
    }

//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class One {
//    public static void main(String[] args) {
//        String [] questions = new String[4];
//        questions[0] ="What do we drink first thing in the Morning?";
//        questions[1] = "What is the color of the sky ?";
//        questions [2] ="What comes after number 3 ?";
//        questions[3] ="What is the height of Eifil Tower ? ";
//        questions[4] ="Which programming language is the best ?";
//
//
//
//        String [] options = new String[4];
//        options[0] =("a. Tea   b. Coffee   c. Milk    d.  Beer";
//        options[1] = "a. Pink    b. Blue   c. Red    d.  Yellow";
//        options[2] =  "a. 2      b. 34   c. 5    d.  4 ";
//        options[3] = "a. 333m    b. 245m   c. 300m    d.  400m";
//        options[4] = "a. Java    b. Python   c. C++    d.  C";
//    };
//
//    Scanner answer = new Scanner(System.in);
//    String[] rAnswers = {"A","B","D","C","A"};
//
//    for (int i =0 ; i < question.length ;i++);
//
//}