import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FlattenListOfListTwo {

    /*
    10.2 "Given a list of lists, where each inner list contains strings representing comma-separated integers,
flatten the list and calculate the sum of all unique even numbers. However, if any of the inner lists is empty or contains no valid integers, ignore it.
 Additionally, if the same even number appears in multiple inner lists, ensure it's only summed once."

List<List<String>> input = Arrays.asList(
    Arrays.asList("1,2,3,4", "5,6"),     // even: 2, 4, 6
    Arrays.asList("7,8,9"),             // even: 8
    Arrays.asList("10,12,10"),          // even: 10, 12
    Arrays.asList(),                    // ignored (empty)
    Arrays.asList("11,13,15"),          // no even → ignored
    Arrays.asList("14")                 // even: 14
);

Sol: Sum of unique even numbers: 56

     */


    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("1,2,3,4", "5,6"),     // even: 2, 4, 6
                Arrays.asList("7,8,9"),             // even: 8
                Arrays.asList("10,12,10"),          // even: 10, 12
                Arrays.asList(),                    // ignored (empty)
                Arrays.asList("11,13,15"),          // no even → ignored
                Arrays.asList("14")                 // even: 14
        );

        int sumOfUniqueEvenNumber = listOfList.stream()
                .filter(list -> list != null && !list.isEmpty())
                .flatMap(List::stream)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .map(String::trim)
                .filter(str -> !str.isEmpty())
                .map(str -> {
                    try {
                        return Integer.parseInt(str);
                    }catch (NumberFormatException e ){
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .filter( n -> n%2 == 0)
                .collect(Collectors.toSet())
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(" Sum Of Unique Even Numbers are :: "+sumOfUniqueEvenNumber);





    }

}
