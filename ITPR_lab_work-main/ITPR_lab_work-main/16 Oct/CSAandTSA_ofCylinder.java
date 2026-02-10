package DAY_2;
import java.util.Scanner;
public class CSAandTSA_ofCylinder {
    float pie = 3.12159F;
    float radius ,height, CSA,TSA;
    private void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of Cylinder(in m) :- ");
        radius = sc.nextFloat();
        System.out.println("Enter height of Cylinder(in m) :- ");
        height = sc.nextFloat();
    }
private void CalculatorofCSAandTSA(){
        CSA = 2*pie*radius*height;
        TSA = 2*pie*radius*(radius+height);
}
public void display(){
    System.out.println("Radius of cylinder is "+radius +" m");
    System.out.println("Hieght of cylinder is "+height+" m");

    System.out.println("Curved SUrface Area of cylinder is "+CSA+" m sq. unit");
    System.out.println("Total Surface Area of cylinder is "+TSA+" m sq. unit");


}
    public static void main(String[] args) {
        CSAandTSA_ofCylinder obj = new CSAandTSA_ofCylinder();
        obj.input();
        obj.CalculatorofCSAandTSA();
        obj.display();
    }
}
