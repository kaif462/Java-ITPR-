public class Prime {
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("Prime Numbers between 1 to 100:");
        System.out.println();
        
       
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                
            }
        }
        
        System.out.println("\n");
        
    }
}
