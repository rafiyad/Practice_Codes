import java.util.HashSet;

public class SomeOfTwoNumberInSortedArray {

    public static void main(String[] args) {

        int [] arr ={4,8,9,10,11,15};
        int target= 20;
        // 11 9
        /*for(int i=0; i<arr.length-1;i++){
            for (int j=0; j<i;j++){
                int sum = arr[i]+arr[j];
                if (sum==targer){
                    System.out.println(arr[i]+" "+arr[j]);
            }
            }
        }*/
        HashSet<Integer> seen = new HashSet<>();
        for (int num: arr){
            // Calculate the complement
            int complement = target - num;
            // Check if the complement is in the HashSet
            if (seen.contains(complement)) {
                // If found, print the pair
                System.out.println(complement + " " + num);
                break;
            }
            seen.add(num);
        }

    }
}
