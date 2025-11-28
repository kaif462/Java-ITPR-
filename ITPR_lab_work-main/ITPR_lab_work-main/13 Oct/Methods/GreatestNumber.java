//Program to find greatest among 2 numbers

// package 13 Oct.Methods;

import java.util.Scanner;

public class GreatestNumber {
    
    public static void FindGreatestNumber(int x , int y ){
        if(x>y){
            System.out.println(x+" is greater than "+y);
        }
        else if(y>x){
            System.out.println(y+" is greater than "+x);
        }
        else{
            System.out.println(x+" and "+y + " is equal ");
        }
    }
    

    public static void main(String[] args) {
        int num1 , num2;
        //Creating Scanner Class Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :- ");
        num1 = sc.nextInt();
         System.out.println("Enter Second Number :- ");
        num2 = sc.nextInt();
        FindGreatestNumber(num1,num2);
        sc.close();
    }
}
