
import java.util.Scanner;

public class Even_in_range {
    public static void findeven(int n) {
        if (n == 0) {
            return;
        }

        findeven(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range:");
        n = sc.nextInt();
        findeven(n);
    }
}
