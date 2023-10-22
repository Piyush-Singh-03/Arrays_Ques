public class max_item_array {
    public static void main(String[] args) {
        int[] arr = {22,45,121,32,67};
        System.out.println(maxRange(arr,1,3));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxval = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] > maxval){
                maxval = arr[i];

            }
        }
        return maxval;
    }
    // for interval
static int maxRange(int[] arr , int start , int end){
        if(end < start){
            return -1;
        }
        if (arr == null){
            return -1;
        }

    int maxval = start;
    for(int i =0;i<end;i++){
        if(arr[i] > maxval){
            maxval = arr[i];

        }
    }
    return maxval;

}
}
