package challenge_fundamental;
import java.util.Scanner;

public class pattern_Numb_Star {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst1= n;
        int nst2 = -1;
        int val = 1;
        int row =1;
        while (row<=n){
            for (int cst1=1;cst1<=nst1;cst1++){
                System.out.print(val+ " ");
                val++;
            }
            for (int cst2 = 1;cst2 <= nst2;cst2++){
                System.out.print("*"+" ");
            }
            System.out.println();
            nst1 = nst1 -1;
            nst2 = nst2 +2;
            val = 1;
            row++;

        }
    }
}
