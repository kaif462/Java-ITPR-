public class Fibonacci {
    public static void main(String[] args) {
        int terms = 30;
        int num1 = 0, num2 = 1;
        
        System.out.println("Fibonacci Series till " + terms + " terms:");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(num1 + " ");
            
            // Calculate next Fibonacci number
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        
        System.out.println();
    }
}
