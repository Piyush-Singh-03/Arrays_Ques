import java.util.Scanner;
public class function {
    public static void main(String[] args) {

        // question 1 with functions
        // if number is prime
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
        System.out.println(isprime(num));
    }
    static boolean isprime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while(c*c<= num){
            if(num % c == 0){
                return false;
            }
            c++;
        } return(c*c > num);
    }
}
