import java.util.Arrays;
import java.util.List;

public class SecondLargestElement {

    /*
    8.Find the Second Largest Number using Streams -> List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 25, 30);
     */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 25, 30);
        int secondLargest = numbers.stream()
                .sorted( (number1,number2) -> number2 - number1  ) // sorted in descending order
                .skip(1)
                .findFirst().orElse(-1);

        System.out.println("Second Largest number :: "+secondLargest);

    }

}
