package challenge_fundamental;

import java.util.Scanner;

public class farhenitetoCelcius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min_far = sc.nextInt();
        int max_far = sc.nextInt();
        int step = sc.nextInt();

        int sum = min_far;
        while (sum <= max_far){
            int c = (int)((5.0/9.0)*(sum-32));
            System.out.print(sum+"\t");
            System.out.println(c);
            sum+= step;


        }


    }
}
