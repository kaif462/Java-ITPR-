
import java.util.Scanner;

class AccountProcess {
    Scanner sc = new Scanner(System.in);
    Double Balance = 0.0;
    long AccountNumber;
    String CustomerName,AccountType;
    public void CurrentAccount(){  //For Current Account

        //Asking for Account Number
        System.out.println("Enter your Account number :- ");
         AccountNumber = sc.nextLong();
         sc.nextLine(); // So that the input buffer will be empty for string
        //Asking for Account Holder Name
        System.out.println("Enter your name :- ");
         CustomerName = sc.nextLine();
         //Because Atleast one time Balanced is asked so do-while
         do {
           System.out.println("Enter initial balance(must be >=5000)");
           Balance=  sc.nextDouble();

           if (Balance < 5000) {
               //Telling min. ammount for Initial balance
               System.out.println("Enter amount greater or equal to 5000\n");
           }
       }while(Balance<5000);//If Balance is less than 5000 than ask again

        AccountType = "Current";//To know about the Account Type
        Operations();//Calling Operation to get Options in Current Account
        int Ask ;
        System.out.println("Click 0 to exit or Click 1 to stay in account operation");
        Ask = sc.nextInt();//Storing the choice of User
        if(Ask==0){//Ends the program
            System.out.println("Code Ended");
        }
        else{//Restart the program
            displayaccountchoice();
        }
        sc.close();
    }
    public void SavingAccount(){


        //Asking for Account Number
        System.out.println("Enter your Account number :- ");
         AccountNumber = sc.nextLong();
         sc.nextLine();// So that the input buffer will be empty for string
        //Asking for Account Holder Name
        System.out.println("Enter your name :- ");
         CustomerName = sc.nextLine();
        do {//Because Atleast one time Balanced is asked so do-while
            System.out.println("Enter initial balance(must be >=1000)");
            Balance=  sc.nextDouble();
            if (Balance < 1000) {
                //Telling min. ammount for Initial balance
                System.out.println("Amount must be greater or equal to 1000");
            }

        }while(Balance<1000);
         AccountType = "Saving";//To know about the Account Type
        Operations();//Calling Operation to get Options in Current Account
        int Ask ;
        System.out.println("Click 0 to exit or Click 1 to stay in account operation");
        Ask = sc.nextInt();//Storing the choice of User
        if(Ask==0){
            //Ends the program
            System.out.println("Code Ended");
        }
        else{
            //Restart the program
            displayaccountchoice();
        }
        sc.close();
    }
    public void Operations(){

        int exit;
        do {
            //Atleast a time  operatons is to asked
            System.out.println("Choose an operation :- ");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. A/C info  ");
            System.out.println("4. Balance ");
            System.out.println("Select one :- ");
            int choice = sc.nextInt();
            //Directly sends to the method user tells
            switch(choice){
                case 1:
                    Withdraw();//Calls Withdraw to withdraw Ammount
                    break;
                case 2:
                    Deposit();//Calls Deposit to Deposit ammount
                    break;
                case 3:
                    Accountinfo();//Calls AccountInfo to get Account Information
                    break;
                case 4:
                    balance();//Calls Balance to Know the Bank Balance
                    break;
                default:
                    //if user choice is not from the above
                    System.out.println("Print Enter a valid choice!!");
                    break;
            }
            System.out.println("To exit "+AccountType+" acccount - press 0 ");
            System.out.println("To check more operation in "+AccountType+" account press 1");
            exit = sc.nextInt();//Rceive user choice to know whether carry or end the program
            
            sc.close();
        }while(exit!=0);//if(user enter 0 loop ends
    }
private void Withdraw(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter your ammount to withdraw :- ");
    //Storing Withdrawal Value
    double Withdraw_amount = sc.nextDouble();
    if(Withdraw_amount<=Balance) {
        //Uppdaing the Balance Left
        Balance = Balance - Withdraw_amount;
        System.out.println("Succesfully withdrawn " + Withdraw_amount + " Rs.");
    } else if (Withdraw_amount<0) {
        System.out.println("Enter a positive value to withdraw amount");

    } else{
        System.out.println("Deposit Amount can't be greater than Balance ");
    }
          sc.close();

}
 private void Deposit(){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter amount to Deposit :- ");
    //Storing Deposit Amount
    Double Deposit_Amount = sc.nextDouble();
    //Updaing the Balance after deposit
    Balance = Balance + Deposit_Amount;
          sc.close();

}
private void Accountinfo(){
    System.out.println("Customer Name :- "+CustomerName);
    System.out.println("A/c No. :- "+AccountNumber);
    System.out.println("Type of Account :- "+AccountType);
    System.out.println("Available Balance :- "+Balance);
    System.out.println(" ");
}
 private void balance(){

        System.out.println("Available Balnce is "+Balance);
}


    public void displayaccountchoice() {
        Scanner RSX = new Scanner(System.in);
        //Providing a menu to the user
        System.out.println("Select an account :- ");
        System.out.println("1. Current Account  ");
        System.out.println("2. Saving Account ");
        System.out.println("Select any one(enter numeric value) :- ");
        int value = RSX.nextInt();//Taking the input
        //Acc. to input it Calls the method
            if(value==1){
                CurrentAccount();
            } else if (value==2) {
                SavingAccount();
            }
         else{
                System.out.println("Enter a valid choice ");
            }
            RSX.close();
    }
}
public class Assignent {
     public static void main(String[] args) {
      AccountProcess obj = new AccountProcess();//Creating the object of AccountProcess Class
      obj.displayaccountchoice();//Calling to the display method
    }
}


