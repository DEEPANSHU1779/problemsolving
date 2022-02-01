package challenge_fundamental;

import java.util.Scanner;

public class helpRamu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        for (int i =1;i<=t;i++){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            System.out.println();
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println();
            int[] a = new int[n];
            for (int j=1;j<=n;j++){
                int c = sc.nextInt();
            }
            System.out.println();
            int[] b = new int[m];
            for (int k=1;k<=m;k++){
                int d = sc.nextInt();
            }
            int sum1= 0;
            for (int e = 1;e<=n;e++){
                sum1 += a[e]*c1;
            }
            int sum2= 0;
            for (int e = 1;e<=n;e++){
                sum1 += b[e]*c1;
            }



        }
    }
    public static int min(int n1 , int n2){
        if (n1>n2){
            return n2;
        }
        else
            return n1;
    }
}
