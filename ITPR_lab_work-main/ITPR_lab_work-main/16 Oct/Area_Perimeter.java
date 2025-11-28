package DAY_2;
import java.util.Scanner;
public class Area_Perimeter {
float length , width ;
float area , perimeter;
private void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Length(in m) :- ");
    length = sc.nextFloat();
    System.out.println("Enter Width(in m) :- ");
    width = sc.nextFloat();
}
private void Area(){
    area = length*width;
    System.out.println("Area of the rectangle is "+area);
}
    private void Perimeter(){
        perimeter = 2*(length+width);
        System.out.println("Perimeter of the rectangle is "+perimeter);
    }







    public static void main(String[] args) {
        Area_Perimeter obj = new Area_Perimeter();
        obj.input();
        obj.Area();
        obj.Perimeter();
    }
}
