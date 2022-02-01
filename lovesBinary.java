package challenge_fundamental;

import java.util.Scanner;

public class lovesBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i =0;i<n;i++){
            int a  = sc.nextInt();
            int l = 0;
            int sum =0;
            while (a>0){
                double rem = a%10;
                double val = Math.pow(2,l);
                double res = rem * val;
                sum+= res;
                a  = a/10;
                l++;
            }
            System.out.println(sum);
        }
    }
}
