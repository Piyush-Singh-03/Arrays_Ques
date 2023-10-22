import java.util.Arrays;
import java.util.Scanner;
public class array_primitives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println(arr[1]);
//        String[] arr1 = new String[6];
//        System.out.println(arr1[3]);
        int[] arr = new int[3];
        arr[0] = 23;
        arr[1] = 43;
        arr[2] = 56;
        System.out.println(arr[2]);
        // input using for loops
        for(int i = 0;i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // easiest way to print array
//        for(int i = 0;i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        for( int num : arr){
//            System.out.print(num + " ");
//        }

    }
}
