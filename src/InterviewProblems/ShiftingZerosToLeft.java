package InterviewProblems;

import java.util.Arrays;
import java.util.Comparator;

public class ShiftingZerosToLeft {

    public static void main(String[] args) {

        // Shift all zero's to left

        int[] arr = {1, 2, 1, 3, 0, 2, 9, 7, 0, 4, 0, 6, 0, 7, 6};

        int[] result = Arrays.stream(arr)
                .boxed() // Convert to Stream<Integer>
                .sorted(Comparator.comparingInt(a -> a == 0 ? 0 : 1))
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Shifting all zeros to Left::::::");
        System.out.println(Arrays.toString(result));


        // shift all zero's to right
        int[] array = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(a -> a == 0 ? 1 : 0))
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println("Shifting all zeros to Right::::::::");
        System.out.println(Arrays.toString(array));


    }

}
