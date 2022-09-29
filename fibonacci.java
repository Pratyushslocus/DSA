package recursion;
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);

        int fibn = fibnm1 + fibnm2;

        return fibn;
    }
}
