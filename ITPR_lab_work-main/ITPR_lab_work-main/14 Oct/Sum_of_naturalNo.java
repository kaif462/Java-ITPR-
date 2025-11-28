package DAY_1;
import java.util.Scanner;
public class Sum_of_naturalNo {
    int n ;
    private void input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        n = sc.nextInt();
    }
    private void SumofNaturalnumber(){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum  = sum + i;
        }
        System.out.println("The sum of first "+n + " Natural number is "+sum);
    }

    public static void main(String[] args) {
    Sum_of_naturalNo obj = new Sum_of_naturalNo();
    obj.input();
    obj.SumofNaturalnumber();
    }


}
