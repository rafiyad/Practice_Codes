import java.util.Scanner;

public class SumOfNodeBinaryTree {
    public static void main(String[] args) {
        System.out.println("Enter four digit number");
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int a=x%10;
        int b=(x%100)/10;
        int c=(x%1000)/100;
        int d=(x/1000);

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);

        if(c+d==a+b){
            System.out.println("Lucky Number");
        }
        else
            System.out.println("Not Lucky Number");
    }
}
