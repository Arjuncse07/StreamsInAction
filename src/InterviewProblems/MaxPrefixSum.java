package InterviewProblems;

import java.util.Arrays;

public class MaxPrefixSum {

    public static void main(String[] args) {

        int arr[] = {1, -2, 3, -4, 5};

        //output : [5, 3, 1, -2, -4]

        int[] result = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .mapToInt(i -> i)
                .toArray();

        System.out.println("Result array :: "+Arrays.toString(result));


    }

}
