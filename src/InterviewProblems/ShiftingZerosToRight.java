package InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemNo7 {

    public static void main(String[] args) {
        /*  int[] arr = {1,0,-3,0,5,-2,0,8,0,-4}
           output: { 1,-3,5,-2,8,-4,0,0,0,0 }  */

        int[] arr = {1,0,-3,0,5,-2,0,8,0,-4};

        int[] resultArray = IntStream.concat(
                Arrays.stream(arr).filter(x -> x != 0),
                Arrays.stream(arr).filter(x -> x == 0)
        ).toArray();

        System.out.println("Result:: "+Arrays.toString(resultArray));





        /* Let's do it using Steams of List */

        List<Integer>  numbers = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, -4);

        List<Integer> collect = Stream.concat(
                numbers.stream().filter(n -> n != 0), numbers.stream().filter(n -> n == 0)
        ).collect(Collectors.toList());

        System.out.println(collect.toString());


    }

}
