import java.util.Arrays;
import java.util.Scanner;

public class multidimension_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        234
        455
        345

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

         */
        // INPUT
        int[][] arr1 = new int[3][3];
        for(int row =0; row < arr1.length; row++){
            for(int col =0 ; col < arr1[row].length; col++) {
                arr1[row][col] = sc.nextInt();
            }
        }
        //OUTPUT
//        for(int row =0; row < arr1.length; row++){
//            //for each col in every row
//            for(int col =0 ; col < arr1[row].length; col++) {
//                System.out.print(arr1[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for(int row=0;row<arr1.length;row++){
//            System.out.println(Arrays.toString(arr1[row]));
 //       }
        // enhanced forloop method
//        for(int[] a : arr1){
//            System.out.println(18.toString(a));
//        }


    }
}
