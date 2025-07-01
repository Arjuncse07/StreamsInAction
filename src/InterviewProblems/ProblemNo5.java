package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemNo5 {

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


    }

}
