// package 18 Oct;
import java.util.Scanner;
public class PositiveandNegativeCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            int pos = 0, neg = 0;
            System.out.println("Enter 10 numbers :- ");

            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > 0)
                    pos++;
                else if (arr[i] < 0)
                    neg++;
            }
            System.out.println("Total Positive Numbers = " + pos);
            System.out.println("Total Negative Numbers = " + neg);
            sc.close();
    }
}
