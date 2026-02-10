// package 18 Oct;
import java.util.Scanner;
   public class AverageofArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            int sum = 0;
            System.out.println("Enter 10 numbers :- ");

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                sum = sum + arr[i];
            }
            double avg = sum / 10.0;
            System.out.println("Average = " + avg);
            sc.close();


    }

}
