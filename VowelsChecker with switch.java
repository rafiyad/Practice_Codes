import java.util.Scanner;

public class VowelsChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        switch (c){
            case 'a','A','e','E','i','I','o','O','u','U': System.out.println(c+" is a vowel");break;
            default: System.out.println(c+" is a consonant");
        }




    }
}
