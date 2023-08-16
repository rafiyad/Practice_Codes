import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner inout =new Scanner(System.in);
        System.out.println("Enter your number: ");
        n=inout.nextInt();
        for (int i=n;i>1;i--){
            fact=fact*i;
        }
            System.out.println("Factorial of "+n+" is "+fact);
    }
}
