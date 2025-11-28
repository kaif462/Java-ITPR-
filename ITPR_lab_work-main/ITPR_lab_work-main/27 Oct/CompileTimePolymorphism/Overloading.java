// package 27Oct.CompileTimePolymorphism;

 class AreaCalculator {
    public void CalculateArea(int side){//Area of square
        System.out.println(" This is a Square ");
        System.out.println("Side : "+side);
        int area  = side * side;
        System.out.println("Area : "+area);
    }
    public void CalculateArea(float radius){
        float area = 3.14159f * radius * radius;
        System.out.println("This is circle  ");
        System.out.println("Radius : "+radius);
        System.out.println("Area : "+area);
    }
}
class Overloading{
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();
        obj.CalculateArea(7);
        obj.CalculateArea(8f);

    }
}
