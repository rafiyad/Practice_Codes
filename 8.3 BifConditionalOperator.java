import java.util.Scanner;

public class BifConditionalOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int big;
        System.out.println("Enter your three numbers: ");
        int n1= in.nextInt();
        int n2= in.nextInt();
        int n3= in.nextInt();
        big = (n1>n2)? n1: n2;
        big = (big>n3)?big:n3;
        System.out.println("Big number is "+big);
    }
}
