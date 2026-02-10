//Program to calculate sum of two number

// package 13 Oct.Methods;
import java.util.Scanner;

public class SumofTwoNo {

	public static void CalculateAddition(int x , int y) {
		System.out.println("Sum of "+x+ " and "+y+ " is " +(x+y));
	}
    public static void main(String[] args) {
		 int num1 , num2;
        //Creating Scanner Class Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :- ");
        num1 = sc.nextInt();
         System.out.println("Enter Second Number :- ");
        num2 = sc.nextInt();
		sc.close();
		CalculateAddition(num1,num2 );
		
	}
}
