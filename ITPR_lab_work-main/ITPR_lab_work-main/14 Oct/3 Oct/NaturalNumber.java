import java.util.Scanner;
public class NaturalNumber {

	public static void main(String[] args) 
	{
		//variable to store a number
		int num;
		//creating an object to input data
		Scanner sc = new Scanner(System.in);
		
		//input of data
		System.out.print("Enter any number : ");
		num = sc.nextInt();
		//verifying a number is natural number
		if(num > 0)
		{
			System.out.println(num+" is natural number");
		}
		else
		{
			System.out.println(num+" is not a ntural number");
		}
        sc.close();

	}

}