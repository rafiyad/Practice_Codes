import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println("Enter your number ");
       Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if (primeChecker(n)) {
            System.out.println(n+" is prime a number.");
        }
        else
            System.out.println(n+" is not a prime number.");
    }
    static boolean primeChecker(int n){
        boolean isPrime = true;
        for (int i=2; i<n;i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }

}
