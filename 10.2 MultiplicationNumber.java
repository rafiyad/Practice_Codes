import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class MultiplicationNumber {
    public static void main(String[] args) {
        int n,temp=1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n=in.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }


    }
}
