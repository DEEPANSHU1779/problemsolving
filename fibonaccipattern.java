package challenge_fundamental;

import java.util.Scanner;

public class fibonaccipattern {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int nst = 1;
        int row =1;
        int a =0;
        int b =1;
        int sum =0;
        while(row<=n){
            sum = a+b;
            for (int cst =1;cst<=nst;cst++){
                System.out.print(a+"\t");
                a=b;
                b=sum;

            }


            System.out.println();
            nst++;

            row++;


        }


    }
    public static void print(int n ){
        int a = 0;
        int b =1;
        int cnt =0;
        int sum =0;
        System.out.print("0"+" ");
        while(cnt < n){
            System.out.print(b+" ");
            sum = a+b;
            a =b ;
            b = sum ;

        }
    }
}
