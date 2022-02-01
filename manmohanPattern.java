package challenge_fundamental;

import java.util.Scanner;

public class manmohanPattern {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int nst = 1;
        int nsp = -1;
        int row =1;
        while(row<=n){
            if (row%2 == 0){
                System.out.print("1");
                for (int i =1;i<=nst-2;i++){
                    System.out.print("0");
                }
                System.out.print("1");
            }
            else{
                for (int i =1;i<=nst ;i++){
                    System.out.print("1");
                }
            }
            System.out.println();
            nst++;
            row++;
        }

    }
}
