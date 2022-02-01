package challenge_fundamental;

import com.company.True;

import java.util.Scanner;

public class basic_Calculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char c ;
        while (true){
            c = sc.next().charAt(0);
            if (c == 'X'|| c == 'x'){
                return ;
            }
            else{
                if (c== '+'){
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    System.out.println(n1 + n2);
                }
                else if (c== '-'){
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    System.out.println(n1 - n2);
                }
                else if (c== '*'){
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    System.out.println(n1 * n2);
                }
                else if (c== '/'){
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    System.out.println(n1 / n2);
                }
                else if (c== '%'){
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    System.out.println(n1 % n2);
                }
                else{
                    System.out.println("Invalid operation. Try again.");
                }

            }


        }

    }

    }

