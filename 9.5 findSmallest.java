import java.util.Scanner;

public class findSmallest {
    public static void main(String[] args) {
        int count=1,small = 2147483647,n;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your number");
            n=input.nextInt();
            if (n<small)
                small=n;
            count++;
        }
        while (count<=5);
        
        System.out.println("Smallest number is :"+small);
    }
}
