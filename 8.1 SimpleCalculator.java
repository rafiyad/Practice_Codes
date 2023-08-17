import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        double ch=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        System.out.println("Enter any arithmetic opration");
        System.out.println("1 Addition");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        int c = input.nextInt();
        switch (c) {
            case 1: ch = n1 + n2;break;
            case 2: ch= Math.abs(n1-n2);break;
            case 3: ch =n1*n2;break;
            case 4: ch =n1/n2;break;
            default:
                System.out.println("The chose  is invalid. Please try again");
                System.exit(1);
        }
        System.out.println("Result = "+ch);
    }
}
