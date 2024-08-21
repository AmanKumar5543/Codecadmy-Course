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
