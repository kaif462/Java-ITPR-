package DAY3;
import java.util.Scanner;

public class Studentclass {
        String name;
        int age;
        String standard;
        int rollNumber;

        Studentclass(String name, int age, String standard, int rollNumber) {
            this.name = name;
            this.age = age;
            this.standard = standard;
            this.rollNumber = rollNumber;
        }
        void display() {
            System.out.println("\nStudent Details :- ");
            System.out.println("Name :- " + name);
            System.out.println("Age :- " + age);
            System.out.println("Standard :- " + standard);
            System.out.println("Roll Number :- " + rollNumber);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter student name :- ");
            String name = sc.nextLine();
            System.out.print("Enter student age :- ");
            int age = sc.nextInt();
            sc.nextLine(); // to consume leftover newline

            System.out.print("Enter student standard :- ");
            String standard = sc.nextLine();

            System.out.print("Enter student roll number :- ");
            int rollNumber = sc.nextInt();

            Studentclass s1 = new Studentclass(name, age, standard, rollNumber);
            s1.display();


        }
    }


