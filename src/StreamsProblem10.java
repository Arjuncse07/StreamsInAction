import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProblem10 {
    /*
    "10.2 ""Given a list of lists, where each inner list contains strings representing comma-separated integers,
flatten the list and calculate the sum of all unique even numbers. However, if any of the inner lists is empty or contains no valid integers, ignore it.
 Additionally, if the same even number appears in multiple inner lists, ensure it's only summed once.""

List<List<String>> input = Arrays.asList(
    Arrays.asList(""1,2,3,4"", ""5,6""),     // even: 2, 4, 6
    Arrays.asList(""7,8,9""),             // even: 8
    Arrays.asList(""10,12,10""),          // even: 10, 12
    Arrays.asList(),                    // ignored (empty)
    Arrays.asList(""11,13,15""),          // no even → ignored
    Arrays.asList(""14"")                 // even: 14
);

Sol: Sum of unique even numbers: 56"
     */

    public static void main(String[] args) {


        List<List<String>> inputListofList = Arrays.asList(
                Arrays.asList("1, 2, 3, 4", "5, 6"),
                Arrays.asList("7, 8, 9"),
                Arrays.asList("10, 12, 10"),
                Arrays.asList(),
                Arrays.asList("11, 13, 15"),
                Arrays.asList("14")
        );

        List<Integer> flattenList = inputListofList.stream()
                .flatMap(List::stream)
                .map(str -> str.split(",\\s*"))
                .flatMap(Arrays::stream)
                .map(Integer::parseInt)
                .filter( e-> e % 2 ==0)
                .distinct()
                .collect(Collectors.toList());

       int sumOfEvenNumber = flattenList.stream()
                        .reduce(0,Integer::sum);

        System.out.println(" FlattenList :: "+flattenList);
        System.out.println(" Sum of Even Number List :: "+sumOfEvenNumber);

        /*************************** METHOD 2 ******************************************************/

        int sumOfEvenNumber2 = inputListofList.stream()
                .flatMap(List::stream)
                .map(str -> str.split(",\\s*"))
                .flatMap(Arrays::stream)
                .map(Integer::parseInt)
                .filter( e-> e % 2 ==0)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Method 2 :: "+sumOfEvenNumber2);


    }
}