import java.util.Scanner;

public class SumGivenNum {
    public static void main(String[] args) {
        int n,sum=0,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n=input.nextInt();
        while (n>0) {
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println("Sum of your number "+sum);

    }
}
