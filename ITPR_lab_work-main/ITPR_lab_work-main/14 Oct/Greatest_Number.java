package DAY_1;
import java.util.Scanner;
public class Greatest_Number {
    float First_num,Second_num,Third_num;
    private void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NUmber :-");
         First_num = sc.nextFloat();
        System.out.println("Enter Second NUmber :-");
        Second_num = sc.nextFloat();
        System.out.println("Enter Thrid NUmber :-");
         Third_num = sc.nextFloat();

    }

    private void Greatest_num() {
        if (First_num > Second_num) {
            System.out.println(First_num + " is Greatest");
        } else if (Second_num > Third_num) {
            System.out.println(Second_num + " is the Greatest");
        } else {
            System.out.println(Third_num + " is the Greatest");
        }

    }

   public static void main(String[] args) {
         Greatest_Number obj = new Greatest_Number();
         obj.input();
         obj.Greatest_num();


    }
}
