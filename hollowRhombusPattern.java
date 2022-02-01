package challenge_fundamental;

import java.util.Scanner;

public class hollowRhombusPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int row = 1;
        while (row<=n){
            for (int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }
            if (row==1 || row==n){
                for (int i =1;i<=n;i++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int i=1;i<=n-2;i++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            row++;
        }
    }
}
