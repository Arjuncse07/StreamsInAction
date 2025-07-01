package InterviewProblems;

import java.util.Arrays;

public class ProblemNo04 {

    /*  int[] arr = {-1, 2, -3, 4, -5, 6,7, -8, 9}
    into // Expected output: [-1, -3, -5, -8, 2, 4, 6, 7, 9]   */

    public static void main(String[] args) {

        int[] arr = {-1, 2, -3, 4, -5, 6,7, -8, 9};

        int[] result = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    if (a < 0 && b >= 0) return -1;
                    if (a >= 0 && b < 0) return 1;
                    return 0;
                }).mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));

    }

}
