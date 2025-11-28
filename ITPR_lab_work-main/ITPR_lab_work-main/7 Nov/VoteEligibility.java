import java.util.Scanner;
class AgeException extends Exception
{
    public AgeException(String msg)
    {
        super(msg);
    }
}
public class VoteEligibility  {
    public static void main(String[] args) throws AgeException{
       int age ;
       //Creating object of class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :- ");
        age = sc.nextInt();
        if(age >= 0)
        {
           if(age<18){
               System.out.println("You are not eligible");
           }
           else{
               System.out.println("You are eligible to vote");
           }
        }
        else{
            //throw the exception
            throw new AgeException("Age can't be negative");
            //    sc.close();
        }
        sc.close();
    }
}
