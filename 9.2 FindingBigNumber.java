import java.util.Scanner;

public class FindingBigNumber {
    public static void main(String[] args) {
        int count=1,big=0,n;
        Scanner input = new Scanner(System.in);
        while (count<=5){
            System.out.println("Enter your number: ");
            n=input.nextInt();
            if(n>big)
                big=n;
        count++;
        }
        System.out.println("Big number is: "+big);
    }
}