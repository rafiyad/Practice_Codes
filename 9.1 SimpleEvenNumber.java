import java.util.Scanner;

public class SimpleEvenNumber {
    public static void main(String[] args) {

       StringBuilder output = new StringBuilder();
        int x=1;
        while (x<=10){
            if(x%2 ==0) {
                System.out.print(x);
                if (x < 10) {
                    System.out.print(",");
                }
            }
            x++;
        }

    }
}
