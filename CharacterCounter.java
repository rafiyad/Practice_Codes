import java.util.*;

public class CharacterCounter {
    public static void main(String[] args) {

        String sentence="This is a common interview question";
        //splitting the sentence into chars array qnd converting into lower case
        char [] collectedChars= sentence.toLowerCase().toCharArray();
        //Declare an empty HashMap for key value storage
        Map<Character, Integer> myMap= new HashMap<>();
        int max=1;
        //looping throw the chars array and putting one by one character in the HashMap and its value
        for (char c:collectedChars) {
            if (!String.valueOf(c).isBlank()) {
                if (myMap.containsKey(c)) {
                    myMap.put(c, myMap.get(c) + 1);
                } else
                    myMap.put(c, 1);
            }
        }
        //Method 1
        myMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                findFirst().ifPresent(System.out::println);

        //Method 2
       /* Map.Entry<Character, Integer> firstEntry = myMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst()
                .orElse(null);

        Character firstKey = null;
        Integer firstValue = null;

        if (firstEntry != null) {
            firstKey = firstEntry.getKey();
            firstValue = firstEntry.getValue();
        }
        // Print the values
        System.out.println("Key: " + firstKey);
        System.out.println("Value: " + firstValue);
*/

        /*//Method 3
        List<Map.Entry<Character, Integer>> entries=new ArrayList<>(myMap.entrySet());
        Collections.sort(entries, (o1,  o2) -> o2.getValue().compareTo(o1.getValue()));
        //printing the first value of the list
        System.out.println(entries.get(0));
*/

        /*//Method 4
        System.out.println(myMap);
        //Storing the max repeated value in max variable
        for (char ch: myMap.keySet()){
            //System.out.println(myMap.get(ch));
            if(myMap.get(ch)>max){
                max=myMap.get(ch);
            }
        }
        //Printing the max character that repeated and it's values
        for (char ch: myMap.keySet()){
            if(max==myMap.get(ch)){
                System.out.println(ch+" : "+myMap.get(ch));
            }
        }

*/

    }
}

