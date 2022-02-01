package challenge_fundamental;

import java.util.Scanner;

public class manmohanPattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 0;
        int row = 2;
        System.out.println("1");
        while(row<=n){
            System.out.print(row-1);
            for (int i =1;i<=nst;i++){
                System.out.print("0");
            }
            System.out.print(row-1);
            System.out.println();
            nst++;
            row++;
        }
    }
}
