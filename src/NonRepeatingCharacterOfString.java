import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NonRepeatingCharacterOfString {

    /*
      9.First Non-Repeating character of the String  ::
      Stream<String> streamOfStrings = Stream.of("apple", "banana", "apricot");
     */


    public static void main(String[] args) {
        Stream<String> streamOfStrings = Stream.of("apple", "banana", "apricot");

      Optional<Character> firstNonRepeating = streamOfStrings
              .flatMap(str -> str.chars().mapToObj(c-> (char)c))
                .collect(Collectors.collectingAndThen(
                        Collectors.groupingBy(
                                Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()
                        ),
                    map ->map.entrySet()
                                                          .stream()
                            .filter( e-> e.getValue() == 1)
                            .map(Map.Entry::getKey)
                            .findFirst()
                ));

          firstNonRepeating.ifPresent( ch-> System.out.println( " First non repeating character of string are ::  "+ch));

          /*  Round : 2 Fist non-repeating character in string */

        String input = "ibmjava";
        char[] charArray = input.toCharArray();

        for( char ch : charArray){
            System.out.println(ch);
        }

        input.chars()
                .mapToObj( c -> (char)c )
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));





    }
}
