import java.util.Scanner;
 class InvalidDimException extends Exception{
    public InvalidDimException(String  message){
        super(message);
    }
}
public class Rectangle {
    public static void main(String[] args) throws InvalidDimException{
        float length;
        float width;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        length=sc.nextFloat();
        System.out.println("Enter Width:");
        width=sc.nextFloat();
        if(length>=0&&width>=0){
            System.out.println("Rectangle");
            System.out.println("length:"+length+"cm");
            System.out.println("Width:"+width+"cm");

            double area=length*width;
            System.out.println("Area:"+area+"sq.cm");
        }
        else{
            throw new InvalidDimException("Dimension can not be negative");
        }
    }
}
