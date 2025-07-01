package InterviewProblems;

import java.util.Arrays;

public class SegregateEvenOdd {
  /*     int[] arr = {1,2,3,4,5,6,7,8,9}; segregate all even and odd numbers
          Excepted Output: [2,4,6,8,1,3,5,7,9]                  */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[]  result = Arrays.stream(arr)
                .boxed()
                .sorted((a, b) -> {
                    if (a % 2 == 0 && b % 2 != 0) return -1;
                    if (a % 2 != 0 && b % 2 == 0) return 1;
                    return 0;
                })
                .mapToInt(Integer::intValue)
                .toArray();

       Arrays.stream(result).forEach( e -> System.out.println(e));


       /* Now  int[] arr = {1,2,3,4,5,6,7,8,9};  into Excepted Output: [1,3,5,7,9,2,4,6,8] */

        int[] result2 = Arrays.stream(arr)
                .boxed()
                .sorted(
                        (a, b) -> {
                            if (a % 2 == 0 && b % 2 != 0) return 1;
                            if (a % 2 != 0 && b % 2 == 0) return -1;
                            return 0;
                        }
                )
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(result2));


    }

}
