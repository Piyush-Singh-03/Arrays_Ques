public class arr_col_not_fixed {
    public static void main(String[] args) {
        int [] [] arr2 = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };
        for(int row = 0; row <arr2.length;row++){
            for(int col =0; col < arr2[row].length; col++){
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }
}
