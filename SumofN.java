import java.util.Scanner;

public class SumofN {

    // Recursive method to find sum of n numbers
    public static int findSum(int n) {
        if (n == 0) {
            return 0; // Base case
        }
        return n + findSum(n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int sum = findSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

    }
}

