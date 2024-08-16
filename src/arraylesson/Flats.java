package arraylesson;
import java.util.ArrayList;

public class Flats {         // here we have made two-dimensional array
    public static void main(String[] args) {
        int[][] flat;
        flat = new int[5][4];

        flat[0][1] = 1001;
        flat[0][2] = 1002;
        flat[0][3] = 1003;
        flat[1][0] = 100;
        flat[1][1] = 101;
        flat[1][2] = 102;
        flat[1][3] = 103;
        flat[2][0] = 200;
        flat[2][1] = 201;
        flat[2][2] = 202;
        flat[2][3] = 203;

        System.out.println(flat[2][1]);
        for (int i = 0 ; i < 5 ; i++) {   //ere we used nested for loop to print the value of two-dimensional array
            for (int j = 0; j < 4; j++) {
                System.out.println(flat[i][j]);
            }
        }
    }
}
