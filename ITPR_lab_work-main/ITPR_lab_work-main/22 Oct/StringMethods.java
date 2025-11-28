package DAY6;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word :- ");
        String str1 = sc.nextLine();

//        sc.nextLine();
        System.out.println("Enter second word :- ");
        String str2 = sc.nextLine() ;
        System.out.println(str1.equals(str2));

    }
}
