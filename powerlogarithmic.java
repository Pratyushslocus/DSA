package recursion;

import java.util.Scanner;

public class powerlogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int xpownb2 = power(x, n/2);

        int ans = xpownb2 * xpownb2;

        if(n % 2 == 1){
            ans = x * ans;
        }
        return ans;
    }
}
