import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedListIntoSingleSortedList {


    /*
    5.6 Merge two sorted lists into a single sorted list using Java streams:
List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
     */

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> sortedList = new ArrayList<>();
        sortedList.addAll(list1);
        sortedList.addAll(list2);

       // First Approach
       List<Integer> list = sortedList
               .stream()
               .sorted(Comparator.comparingInt(Integer::intValue))
               .collect(Collectors.toList());

        System.out.println("List ::: "+list);


        // Second Approach
        List<Integer> mergeSortedList = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(" MergeSort List :: "+mergeSortedList);


        // Third Approach
        List<List<Integer>> listOfList = Arrays.asList(list1, list2);

        System.out.println(" :: "+listOfList);

        List<Integer> mergeSortedLst = listOfList
                .stream()
                .flatMap(List::stream)
                .sorted().collect(Collectors.toList());

        System.out.println(" Third Approach using FlatMap :: "+mergeSortedLst);


    }

}
