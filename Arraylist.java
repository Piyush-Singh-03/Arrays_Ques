import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(34);
//        list.add(67);
//        list.add(34);
//        list.add(67);
//        list.add(34);
//        list.add(67);
//        list.add(34);
//        //you can add as many as you want , without considering initial capacity ie-10
//        //you can change , update , check and do lot of other functins on it
//        System.out.println(list.contains(67));
//        System.out.println(list);
//        list.set(0, 99);
//        System.out.println(list);
        // input
        for(int i =0; i<5;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        // or print like this
        for(int i =0; i<5;i++){
            System.out.println(list.get(i)); // pass index here , list[index] syntax won't work here
        }
    }
}
