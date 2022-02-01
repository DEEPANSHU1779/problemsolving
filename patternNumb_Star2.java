package challenge_fundamental;

import java.util.Scanner;

public class patternNumb_Star2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst1 = 1;
        int nst2 = n-1;
        int row = 1 ;
        int val = 1;
        while (row<=n &&  (n>=1 && n<=10)){
            for (int cst1 = 1;cst1<=nst1;cst1++){
                System.out.print(val);
                val++;
            }
            for (int cst2 = 1;cst2<=nst2;cst2++){
                System.out.print("*");
            }
            System.out.println();
            val=1;
            nst1++;
            nst2--;
            row++;
        }
    }
}
