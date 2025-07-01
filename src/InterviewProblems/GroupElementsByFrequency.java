package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GroupElementsByFrequency {

    /* int[] arr = {4, 4, 2, 2, 8, 3, 3, 1};
       Expected output: [1, 8, 2, 2, 3, 3, 4, 4]  */

    public static void main(String[] args) {

        int[] arr = {4, 4, 2, 2, 8, 3, 3, 1};

        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int[] result = Arrays.stream(arr).boxed()
                .sorted(
                        Comparator.<Integer, Long>comparing(frequencyMap::get)
                                .thenComparing(i -> i)
                ).mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(result));

        /*  Round : 2  */

        /* int[] arr = {4, 4, 2, 2, 8, 3, 3, 1};
       Expected output: [2,2,3,3,4,4,1,8]   */


        /*  Round: 3
        * Input: arr = [1, 2, 2, 3, 1, 4]
         Output: [1, 1, 2, 2, 3, 4] (1 and 2 appear twice, 3 and 4 appear once)
        *  */

        int[] array = {1, 2, 2, 3, 1, 4};

        Map<Integer, Long> freqMap = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Map :: "+freqMap);

        //Arrays.stream(array)
          //      .boxed()

        int[] resultArr = freqMap.entrySet().stream().sorted(
                        (a, b) -> {
                            int freqCompare = b.getValue().compareTo(a.getValue());
                            System.out.println("Comparing: " + a + " vs " + b + ", freqCompare: " + freqCompare);
                            return freqCompare != 0 ? freqCompare : a.getKey().compareTo(b.getKey());
                        })
                .flatMapToInt(entry -> {
                    System.out.println("Generating values for key: " + entry.getKey() + " with frequency: " + entry.getValue());
                            return IntStream.generate(() -> entry.getKey()).limit(entry.getValue());
                        }
                ).toArray();

        System.out.println(Arrays.toString(resultArr));


    }

}
