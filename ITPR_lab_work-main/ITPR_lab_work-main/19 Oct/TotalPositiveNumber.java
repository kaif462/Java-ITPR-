// package 19 Oct;
import java.util.Scanner;
public class TotalPositiveNumber {
    int[] arr = new int[10];
    int poscount = 0;
    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Elemnets of array :- ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
        private void CountingPositiveNumber(){
            for(int i = 0 ; i< 10 ; i++){
                if(arr[i] > 0 ) poscount++;
            }
            System.out.println("Total positive numbers are  "+poscount);

    }
    public static void main(String[] args) {
        TotalPositiveNumber obj = new TotalPositiveNumber();
        obj.input();
        obj.CountingPositiveNumber();
        
    }

}
