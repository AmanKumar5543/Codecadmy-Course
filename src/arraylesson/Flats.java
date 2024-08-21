package arraylesson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Flats {         // here we have made two-dimensional array
    public static void main(String[] args) {
//        int[][] flat;
//        flat = new int[5][4];
//
//        flat[0][1] = 1001;
//        flat[0][2] = 1002;
//        flat[0][3] = 1003;
//        flat[1][0] = 100;
//        flat[1][1] = 101;
//        flat[1][2] = 102;
//        flat[1][3] = 103;
//        flat[2][0] = 200;
//        flat[2][1] = 201;
//        flat[2][2] = 202;
//        flat[2][3] = 203;
//
//        System.out.println(flat[2][1]);
//        for (int i = 0 ; i < 5 ; i++) {   //ere we used nested for loop to print the value of two-dimensional array
//            for (int j = 0; j < 4; j++) {
//                System.out.println(flat[i][j]);
//            }
//        }
//        System.out.println("Please enter total number of arrays");
//        Scanner input = new Scanner(System.in);
//        int totalArray = input.nextInt();        //putting the value of total number of array elements we want
//        int arrayLength[] = new int[totalArray];  //here we equalize arraylength with the value we put
//        System.out.println("please enter array element value");
//        for(int i = 0 ; i < totalArray ; i++){
//            arrayLength[i] = input.nextInt();      // here we put the value  of elements in for loop
//            System.out.println(arrayLength[i]);   //
//        }
//        System.out.println("Array elements are here");
//        for (int i = 0 ; i < arrayLength.length ; i ++){
//            System.out.println(arrayLength[i]);
//        }
        System.out.println("please enter the length of array");
        Scanner input = new Scanner(System.in);
        int totalArray = input.nextInt();
        int arrayLength[] = new int[totalArray];
        System.out.println("Now put the value of elements of that array");
        //here we form a for loop
        for (int i = 0 ; i < arrayLength.length ; i++) {
            arrayLength[i] = input.nextInt();
            System.out.println(arrayLength[i]);
        }
        System.out.println("The elements of array");
        for (int i = 0; i < arrayLength.length ; i++){
            System.out.println(arrayLength[i]);
        }
        System.out.println(Arrays.stream(arrayLength).sum());
        System.out.println(Arrays.stream(arrayLength).boxed());
    }
}
