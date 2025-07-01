package InterviewProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class InterleaveArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        //output : {1,2,3,4,5,6}

        int[] result = interleaveArrays(arr1, arr2);
        System.out.println(        Arrays.toString(result));


    }

    private static int[] interleaveArrays(int[] arr1, int[] arr2){
        return IntStream.range(0, arr1.length + arr2.length)
                .map( i -> (i % 2 ==0) ? arr1[i/2] : arr2[i/2])
                .toArray();
    }

}
