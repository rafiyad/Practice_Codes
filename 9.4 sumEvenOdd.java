public class sumEvenOdd {
    public static void main(String[] args) {
        int i=1,sumeven=0,sumodd=0;
        while (i<=100){
            if (i%2==0){
                sumeven=sumeven+i;
            }
            else sumodd=sumodd+i;
            i++;
        }
        System.out.println(sumeven);
        System.out.println(sumodd);
    }
}
