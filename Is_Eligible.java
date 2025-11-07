import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class Is_Eligible {
    public static void main(String[] args) throws InvalidAgeException {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age:");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for Voting");
        }
        else{
            throw new InvalidAgeException("Not Eligible");
        }
    }
}
