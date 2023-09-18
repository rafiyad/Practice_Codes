import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your positive integer: ");
        int x=in.nextInt();
       int sum=0;
       while (x>0){
           sum += (x%10);
           x=x/10;
       }

        System.out.println(sum);

    }
}
