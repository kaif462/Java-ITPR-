// package 6 Oct;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float sub1,sub2,sub3,sub4,sub5;
        System.out.println("Enter First subject number : ");
        sub1 = sc.nextFloat();
         System.out.println("Enter Second subject number : ");
        sub2 = sc.nextFloat();
         System.out.println("Enter Third subject number : ");
        sub3 = sc.nextFloat();
         System.out.println("Enter Fourth subject number : ");
        sub4 = sc.nextFloat();
         System.out.println("Enter Fifth subject number : ");
        sub5 = sc.nextFloat();

        float total = (sub1 + sub2 + sub3 + sub4 + sub5);
        float percentage = total/5;

        System.out.println("Total marks are "+total+ " out of 500 marks");
        System.out.println("You got "+percentage+"%");
        
        if(percentage >= 75){
            System.out.println(" Grade : A+");
        }
        else if(percentage>=65){
            System.out.println(" Grade : A");

        }
        else if(percentage>=55){
            System.out.println("Grade : B");
        }
          else if(percentage>=45){
            System.out.println("Grade : B");
        }
          else {
            System.out.println("Fail !!");
        }
        
    }
}
