import java.util.Scanner;
//Defining class for Even No
class Even{
    int arr[];
    //Constuctor
    public Even(){
        arr=new int[20];
    // creating object of scanner clss io initilliaze element
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 20 no:");
        for(int index=0;index<arr.length;index++){
            arr[index]=sc.nextInt();
            //Storing no at given index
        }
        System.out.print("-------------------------------");
        sc.close();
        }
        //Method to display even no
        private void displayEven(){
            System.out.println("Even No");
           for(int index=0;index<arr.length;index++){
                if(arr[index]%2==0){
                    System.out.print(arr[index]+" ");
                }
            }}
            //method to display data
            public void display(){
              System.out.println("Numbers are:");
              for(int index=0;index<arr.length;index++){
                System.out.print(arr[index]+" ");
              }
              System.out.println();
              System.out.println("-------------------");
              displayEven();
            }
        
}
public class EvenNo_inArray{
    public static void main(String args[]){
        //creating object
      Even even=new Even();
      even.display();
    }
} 