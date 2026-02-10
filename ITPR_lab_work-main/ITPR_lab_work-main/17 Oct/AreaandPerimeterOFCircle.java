package DAY3;
import java.util.Scanner;
public class AreaandPerimeterOFCircle {
    float pie = 3.14159F;
    float radius , Perimeter,Area;
    private void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle(in m) :- ");
        radius = sc.nextFloat();
    }

private void CalculatorofAreaandPerimeter(){
    Area = pie*radius*radius;
    Perimeter = 2*pie*radius;

    }
    public void display(){
        System.out.println("The radius of circle is "+radius + " m");
        System.out.println("The Area of circle is "+Area + " m sq. unit");
        System.out.println("The Perimeter of circle is "+Perimeter + " m");


    }

    public static void main(String[] args) {
        AreaandPerimeterOFCircle obj = new AreaandPerimeterOFCircle();
        obj.input();
        obj.CalculatorofAreaandPerimeter();
        obj.display();
    }
}
