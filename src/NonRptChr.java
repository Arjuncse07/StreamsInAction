import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRptChr {
    /*
 Problem : 03 Find the First Non-Repeating Character in a String
 */



    public static void main(String[] args) {
        String word = "swiss";
        char result = firstNonRepeatingChar(word);
        System.out.println("Result ::: "+result);

    }


    private static char firstNonRepeatingChar(String input){

        // count the number of characters in a string and store in map
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c-> (char) c)  //convert int to char
                .collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

        return input.chars()
                .mapToObj(c ->(char)c)
                .filter( c-> frequencyMap.get(c) == 1)
                .findFirst()
                .orElse((char) 0); // Return 0 if no non-repeating character found
    }

}
