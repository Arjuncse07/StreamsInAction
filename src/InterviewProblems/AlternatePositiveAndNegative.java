package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlternatePositiveAndNegative {

    /*  int[] arr = {-1, 2, -3, 4, 5, -6, 7, -8};
        Expected output: [-1, 2, -3, 4, -6, 5, -8, 7]    */

    public static void main(String[] args) {

        int[] arr = {-1, 2, -3, 4, 5, -6, 7, -8};

        /*int[] result = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) ->
                {
                    int absoluteCompare = Integer.compare(Math.abs(a), Math.abs(b));
                    return absoluteCompare !=0 ? absoluteCompare : Integer.compare(a,b);
                })
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(result));*/


        Map<Boolean, List<Integer>> partsMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x < 0));

        List<Integer> negatives = partsMap.get(true);
        List<Integer> positives = partsMap.get(false);

        int[] result = IntStream.range(0, arr.length)
                .map(i -> (i % 2 == 0) ? negatives.get(i / 2) : positives.get(i / 2))
                .toArray();

        System.out.println(Arrays.toString(result));


    }

}
