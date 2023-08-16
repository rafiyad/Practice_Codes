import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        int n,sum=0;
        System.out.println("Enter any number to add or Zero(0) for quit");
        Scanner in = new Scanner(System.in);

        while (true){
            n=in.nextInt();
            if(n==0)
                break;
           else
               sum=sum+n;
        }
        System.out.println("Sum of your numbers is "+sum);
    }
}
