import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindLongestString {

    /*
    5.5 Find the longest string in a list of strings using Java streams:

List<String> strings = Arrays
              .asList("apple", "banana", "cherry", "date", "grapefruit");
     */

    public static void main(String[] args) {

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        String maxString = strings.stream()
                .max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Max String :: "+maxString);

    }





}
