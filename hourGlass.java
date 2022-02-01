package challenge_fundamental;
import java.util.Scanner;

public class hourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp =0;
        int nst = 2*n+1;
        int row = 1;
        int nr = 2*n+1;
        int val1 = n-row+1;
        int val2 = 0;
        while(row<= nr &&  n<=20){
            for (int csp =1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for (int cst=1;cst<=nst;cst++){
                if (cst<=nst/2){
                    System.out.print(val1+" ");
                    val1--;
                }
                else{
                    System.out.print(val2+" ");
                    val2++;
                }
            }
            System.out.println();
            if (row<=n){
                nsp++;
                nst-=2;
                val1=n-row;
                val2=0;
            }
            else {
                nsp--;
                nst+=2;
                val1=row-n;
                val2=0;
            }
            row++;
        }
    }
}
