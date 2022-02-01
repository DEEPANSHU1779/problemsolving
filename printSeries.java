package challenge_fundamental;
import java.util.Scanner;

public class printSeries {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        printfirstn1terms(n1,n2);
    }
    public static void printfirstn1terms(int n1,int n2){
        int i =1;
        int cs = 0;
        while (cs<n1){
            int var = 3*i +2;
            if (var% n2 != 0){
                System.out.println(var);
                cs++;
            }
            i++;
        }
    }
}
