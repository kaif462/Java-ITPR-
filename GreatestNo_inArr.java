import java.util.Scanner;
//deifing class for greatest no
class Greatest {
    int arr[];//declearation of array
    public Greatest(){

         arr=new int[15];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 15 no:");
        for(int index=0;index<arr.length;index++){
            arr[index]=sc.nextInt();
        }
        System.out.print("-------------------------------");
        
        sc.close();//close Scanner class to avoid resource leak 
    }
    private void printGreatest(){
       int max=Integer.MIN_VALUE;
       for(int index=0;index<arr.length;index++){
        if(arr[index]>max){
            max=arr[index];
        }
       }
       System.out.println("Max value in Array is:"+max);

    }
     public void display(){
              System.out.println("Numbers are:");
              for(int index=0;index<arr.length;index++){
                System.out.print(arr[index]+" ");
              }
              System.out.println();
              System.out.println("-------------------");
              printGreatest();
            }
    
}
//creating initial Class
public class GreatestNo_inArr {
    public static void main(String[] args) {
        Greatest maxarr=new Greatest();
        maxarr.display();
    }
}
