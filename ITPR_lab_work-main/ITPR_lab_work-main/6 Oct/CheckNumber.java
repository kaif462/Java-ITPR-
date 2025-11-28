// package 6 Oct;

import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Given number is negative");

        }
        else if(num > 0){
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is neither negative nor positive , it is Zero");
        }
        sc.close();
    }
    
}
