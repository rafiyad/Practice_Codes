import java.util.Arrays;

public class WordRepeatingFinder {
    //It will show the how many times a word is repeated
    static int getOccurrences(String source, String word) {
        //Step-by-step procedure
        /*String [] splitedWords=source.toLowerCase().split("[ .']");
        int max=0;
        for (String str: splitedWords){
            if (str.equals(word)){
                max++;
            }
        }
        return max;
        */
        //Using steam and lamda
        return (int) Arrays.stream(source.toLowerCase().split("[ .']")).
                filter(str-> str.equalsIgnoreCase(word)).count();
    }
    public static void main(String[] args) {

        System.out.println(getOccurrences("It was a long day. It was also hot outside. That is how it was", "it"));
    }
}
