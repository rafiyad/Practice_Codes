import java.util.*;
import java.util.stream.Collectors;

public class FewerWord {
    //Showing the words that fewer or equal 5
    static List<String> findFiveOrFewer(String source){
        return Arrays.stream(source.split(" ")).filter(str->str.length()<6)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        String source = "a string of mostly smaller words";
        System.out.println(findFiveOrFewer(source));
    }
}
