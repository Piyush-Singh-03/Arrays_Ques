import java.util.Arrays;

public class passing_array_in_function {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 87};
        System.out.println(Arrays.toString(nums));

        // change the value
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

        static void change(int[] arr) {
            arr[1] = 99;
        }

}
