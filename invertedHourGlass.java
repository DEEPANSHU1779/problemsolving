package challenge_fundamental;
import java.util.Scanner;

public class invertedHourGlass {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = 2*n-1;
        int nr = 2*n +1;
        int val1 = n;
        int row = 1;
        int val2 = n-row+1;

        while(row<=nr){
            for (int cst1=1;cst1<=nst;cst1++){
                System.out.print(val1+" ");
                val1--;
            }
            for(int csp1=1;csp1<=nsp;csp1++){
                System.out.print("  ");
            }
            int cst2=1;
            if (row==n+1){
                cst2=2;
            }
            if (row==n+1){
                val2=n-row+2;
            }
            for(;cst2<=nst;cst2++){

                System.out.print(" "+ val2);
                val2++;
            }
            System.out.println();
            if (row<=n){
                nst++;
                nsp-=2;
                val1=n;
                val2=n-row;
            }
            else{
                nst--;
                nsp+=2;
                val1=n;
                val2 = row-n;
            }
            row++;
        }
    }
}
