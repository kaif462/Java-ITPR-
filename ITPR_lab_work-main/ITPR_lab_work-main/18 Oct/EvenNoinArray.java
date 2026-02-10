// package DAY4;
import java.util.Scanner;
  public class EvenNoinArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[20];
            System.out.println("Enter 20 numbers :- ");

            for (int i = 0; i < 20; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Even numbers are :- ");
            for (int i = 0; i < 20; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            sc.close();

        }
    }

