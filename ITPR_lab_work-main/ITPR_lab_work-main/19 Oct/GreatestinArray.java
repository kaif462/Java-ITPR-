// package 19 Oct;
import java.util.Scanner;
public class GreatestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner Class Objeect Created
        int[] arr = new int[10];
        //Take input in array
        System.out.println(" Enter 10 Element of Array ");
        for(int i = 0 ; i < 10 ; i++ ){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = 0;
        for(int i = 0 ; i < 9 ; i++){
            if(arr[i] < arr[i+1]){
                max = arr[i+1];
            }
        }
        System.out.println("The Greatest Element in array is "+max);
    }   
    
}
