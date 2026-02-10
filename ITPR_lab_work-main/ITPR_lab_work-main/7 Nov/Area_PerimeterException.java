// package 7 Nov;
import  java.util.Scanner;
class Area_Perimeter_Exception extends Exception{
    public Area_Perimeter_Exception(String msg){
        super(msg);
    }
}
public class Area_PerimeterException {
    public static void main(String[] args) throws Area_Perimeter_Exception{
        float length,width;
        //Creating object of Scanner class
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of rectangle(in cm) : ");
        length = sc.nextFloat();

        System.out.println("Enter width of rectangle(in cm) : ");
        width = sc.nextFloat();

        if(length >= 0 && width >= 0)
        {

            System.out.println("Length : "+length+" cm");


            System.out.println("Width : "+width+" cm");

            System.out.println("------- Perimeter -----");
            System.out.println("Perimeter : "+2*(length+width)+" sq.cm");

            System.out.println("------- Area -----");
            System.out.println("Area : "+(length*width)+" sq.cm");
        }
        else{
            //Throw new exception
            throw new Area_Perimeter_Exception("Length or width can't be negative");
        }
        sc.close();
    }
}
