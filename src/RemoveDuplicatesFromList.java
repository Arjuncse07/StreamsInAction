import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {

    /*
    5.4 Remove duplicates from a list while preserving the order using Java streams:

List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
     */

    public static void main(String[] args) {

        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
            List<Integer> sortedList = numbersWithDuplicates.stream()
                .distinct().collect(Collectors.toList());

        System.out.println("Sorted List :: "+sortedList);

    }

}
