package basics;

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
//        int a = 20;
        // Increment Breathing FirstForm
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(++a);
//        System.out.println(a--);
//        System.out.println(a);
//        System.out.println(--a);
//
        // Increment Breathing SecondForm
//        a += 20;
//        System.out.println(a);
//        a *= 2;
//        System.out.println(a);
//        a -= 30;
//        System.out.println(a);
//        a /=5;
//        System.out.println(a);
//
        //Increment breathing Third form
//        int marks = 0;
//        Scanner info = new Scanner(System.in);
//        System.out.println(" which is an even number (2,3) ?");
//        int a = info.nextInt();
//        if (a==2){
//            System.out.println("Correct");
//            marks += 10;
//        }else{
//            System.out.println("Wrooonngggg");
//            marks -= 5;
//        }
//        System.out.println(" which is an odd number (2,3) ?");
//        int b = info.nextInt();
//        if (b==3){
//            System.out.println("Correct");
//            marks += 10;
//        }else{
//            System.out.println("Wrooonngggg");
//            marks -= 5;
//        }
//
//        System.out.println(" which is an negative number (-2,3) ?");
//        int c = info.nextInt();
//        if (c== -2){
//            System.out.println("Correct");
//            marks += 10;
//        }else{
//            System.out.println("Wrooonngggg");
//            marks -= 5;
//        }
//
//        System.out.println(" which is a number greater than 10 (2,30) ?");
//        int d = info.nextInt();
//        if (d==30){
//            System.out.println("Correct");
//            marks += 10;
//        }else{
//            System.out.println("Wrooonngggg");
//            marks -= 5;
//        }
//        System.out.println(" which is a number less than 10 (2,30) ?");
//        int e = info.nextInt();
//        if (e==2){
//            System.out.println("Correct");
//            marks += 10;
//        }else{
//            System.out.println("Wrooonngggg");
//            marks -= 5;
//        }
//
//
//        System.out.println(("total marks obtained  " + marks).toUpperCase());
        // Increment breathing fourth form
        int marks =0;
        for (int i =0 ; i <10 ; i++){
            System.out.println("Right answer marks increased by 10");
            System.out.println("Marks =  " + (marks+=10));
        }
    }
}
