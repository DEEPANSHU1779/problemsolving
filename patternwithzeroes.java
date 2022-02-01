package challenge_fundamental;

import java.util.Scanner;

public class patternwithzeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        int nsp = -1;
        while (row<=n){
            System.out.print(row+"\t");
            for (int csp =1;csp<=nsp;csp++){
                System.out.print("0"+"\t");
            }

            if (row==1){
            }
            else{
                System.out.print(row+"\t");
            }
            System.out.println();
            row++;
            nsp++;
        }

    }
}
