import java.util.Scanner;

public class MaxMinUserInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        int max=n;
        int min=n;

        if(n>=0){
            while (true){
                n=in.nextInt();
                if(n<0){
                    break;
                }
                if(n>max)
                    max=n;
                if(n<min)
                    min=n;
            }
            System.out.println("Max is "+max);
            System.out.println("Minimum is "+min);

        }else {
            System.out.println("Fist number cannot be less than zero");
        }









            }
        }


