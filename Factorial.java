import java.util.Scanner;

public class Factorial{

    public static int calculateFactorial(int num) {
        if(num==0||num==1){
            return 1;
        }
        return num*calculateFactorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //taking input
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        // check no is non negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

    }
}