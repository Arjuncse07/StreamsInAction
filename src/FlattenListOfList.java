import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfList {
 /*
 Flatten List of List :
  List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("fig", "grape"));

  [apple, banana, cherry, date, fig, grape]
  */

    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("fig", "grape"));

      List<String> flattenList  = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(" Flatten List is ::  "+flattenList);

    }

}
