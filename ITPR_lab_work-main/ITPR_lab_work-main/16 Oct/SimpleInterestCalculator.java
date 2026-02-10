package DAY_2;
import  java.util.Scanner;
public class SimpleInterestCalculator {
 float principle , rate , SimpleInterest;
 int time;
 private void input(){
     Scanner sc = new Scanner(System.in);
     System.out.println("ENter principle(in Rs) :- ");
     principle = sc.nextFloat();
     System.out.println("ENter Rate(in %) :- ");
     rate = sc.nextFloat();
     System.out.println("ENter Time(in months) :- ");
     time = sc.nextInt();
 }
 private void SimpleInterest_Calculator(){
     SimpleInterest = principle*rate*time/(100*12);
     System.out.println("THe simple Interest is "+SimpleInterest);
 }
public void display(){
    System.out.println("Principle is "+principle);
    System.out.println("Rate is "+rate);
    System.out.println("time (in months) is "+time);


}



    public static void main(String[] args) {
        SimpleInterestCalculator obj = new SimpleInterestCalculator();
        obj.input();
        obj.display();
        obj.SimpleInterest_Calculator();
    }
}
