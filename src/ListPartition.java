import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListPartition {


    /*
5.1 Implement a method to partition a list into two groups based on a predicate using Java streams:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

Make Two List, {1.List<Integer> evenNumbers} and {2.List<Integer> oddNumbers}
     */


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(num->num % 2 == 0));
        System.out.println(" Even List :: "+map.get(true));
        System.out.println("Odd List :: "+map.get(false));

    }



}
