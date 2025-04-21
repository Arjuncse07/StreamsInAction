import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostRepeatedCharInString {
 /*
  10.Find most repeated character in the streamOf Strings
  Stream<String> streamOfStrings = Stream.of("apple", "banana", "apricot");
  */

    public static void main(String[] args) {
        Stream<String> streamOfStrings = Stream.of("apple", "banana", "apricot");

       Optional<Map.Entry<Character,Long>> mostRepeatedCharacter = streamOfStrings
                .flatMap(str -> str.chars().mapToObj(c -> (char)c))
                .collect(Collectors.groupingBy( Function.identity(), Collectors.counting() ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

       mostRepeatedCharacter.ifPresent( e-> System.out.println("Most Repeated Character is :: "+e));


    }


}
