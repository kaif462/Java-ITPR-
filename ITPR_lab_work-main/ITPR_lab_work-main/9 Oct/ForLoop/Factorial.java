/*Program to calculate factorial of a number */

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
          int num ;
            int fact = 1;
          //Creating object of Scanner Class
          Scanner sc = new Scanner(System.in);
          System.out.println("ENter a number :- ");
          num = sc.nextInt();
          for(int i = 2 ; i <= num ; i ++){
            fact = fact * i;
          }
          System.out.println("Factorial of "+num+ " is "+fact);
          sc.close();
    }
}
