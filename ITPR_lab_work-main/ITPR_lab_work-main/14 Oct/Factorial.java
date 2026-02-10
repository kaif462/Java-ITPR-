package DAY_1;
import java.util.Scanner;
public class Factorial {
    int n ;
    private void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        n = sc.nextInt();
    }
    private void FActorialofaNumber(){
        int i = 2;
        int fact = 1;
        while(i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println("The factorial of "+n+ " is "+fact);
    }

    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.1+0.2;
        if(c == 0.3) {
            Factorial obj = new Factorial();
            obj.input();
            obj.FActorialofaNumber();
        }
        else{
            System.out.println("Not equl");
        }
    }
}
