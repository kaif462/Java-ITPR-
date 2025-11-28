/*
 * Write a program to find out the sum of a given number
 */

// package 11 Oct;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int num ;
        //Creating Object of Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        num = sc.nextInt();
        sc.close();
        int temp = Math.abs(num)
;        int sum = 0 ;//Calulate sum of digit

        while(temp>0){
            sum += temp%10;//extracting last digit
            temp/=10;//removing last digit
        }
        System.out.println("The sum of digit for "+num+ " is "+sum);
    }
    
}
