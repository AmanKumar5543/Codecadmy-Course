package arraylesson;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays {
    //Array is a collection of similar type of Datatypes
    public static void main(String[] args) {
//        Array breathing First form
        int rollNo[] = new int[10];
        String studentName[] = new String[10];
        boolean isPresent[] = new boolean[10];
        try{
            Scanner info = new Scanner(System.in);
            System.out.println("Enter the roll  number of each student ");
            for (int i = 0; i < rollNo.length; i++) {
                rollNo[i] = info.nextInt();
            }
            System.out.println("Enter the names of the Students");
            for (int i = 0; i < studentName.length; i++) {
                studentName[i] = info.nextLine();
            }
            System.out.println("Enter true if the student is present");
            for (int i = 0; i < isPresent.length; i++) {
                isPresent[i+1] = info.nextBoolean();
            }

            System.out.println("Information of the Students");
            for (int i = 0; i < isPresent.length; i++) {

                System.out.println("Roll no. :"+ rollNo[i]);
                System.out.println("Name :" + studentName[i]);
                System.out.println("is Present :" + isPresent[i]);
            }
        }
        catch  (InputMismatchException e){
            System.err.println("Input the value carefully");
        }
    }
}