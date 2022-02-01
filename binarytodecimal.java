package challenge_fundamental;

import java.util.*;

public class binarytodecimal {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        int n = sc.nextInt();
        while (n>0){
            int rem = n%10;
            double val = Math.pow(2,i);
            sum += rem * val ;
            n  = n/10;
            i++;
        }
        System.out.println((int)sum);

    }
}
