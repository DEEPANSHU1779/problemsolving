package challenge_fundamental;

import java.util.Scanner;

public class pythogorousTriplet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pythogorousTripletFind(n);


    }
    public static void pythogorousTripletFind(int n ){
        if (n==1 || n == 2){
            System.out.println("-1");;
        }
        else if (n%2==0){
            int var = n*(n/4);
            System.out.print(var-1+" ");
            System.out.print(var+1);
            System.out.println();
        }
        else if (n%2!= 0){
            int var = n*n +1 ;
            System.out.print(var/2 -1 + " ");
            System.out.print(var/2 );
        }
        else {
            System.out.println(-1);
        }
    }
}
