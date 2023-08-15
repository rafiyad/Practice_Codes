import java.util.Scanner;

public class SimpleBanking {
    public static void main(String[] args) {
        int balance=0,n1,n2;
        Scanner input =new Scanner(System.in);
        do {
            System.out.println("1 for Deposit");
            System.out.println("2 for Withdraw");
            System.out.println("3 for Check Balance");
            System.out.println("4 for Exit");
            n1=input.nextInt();
            switch (n1){
                case 1: {
                    System.out.println("Enter the amount to add");
                    n2 = input.nextInt();
                    balance = balance + n2;
                    System.out.println(n2+" added to your account");
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount to withdraw");
                    n2 = input.nextInt();

                    if(balance<n2)
                        System.out.println("Insufficient balance");
                     else balance = balance - n2;
                    System.out.println(n2+" amount has been withdrawn");
                    break;
                }
                case 3: {
                    System.out.println("You have "+balance+" balance");
                    break;
                }
                default:
                    System.out.println("Please enter the correct number");
            }

        }while (n1 !=4);
        {
            System.out.println("Thank you for banking with us");
        }

    }
}
