import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberUsingStreams {

 /*
 5.3 Check if a list of integers contains a prime number using Java streams:

List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
  */

    public static void main(String[] args) {

        //List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        List<Integer> numbers = Arrays.asList(5, 4, 6, 8, 10, 11, 12, 13, 14, 15);

        Predicate<Integer> greaterThan1 = number -> number>1;
        Predicate<Integer> isPrime = PrimeNumberUsingStreams::isPrimeNumber;

        List<Integer> primeNumberList = numbers.stream()
                .filter(greaterThan1)
                .filter(isPrime)
                .collect(Collectors.toList());

        System.out.println(primeNumberList);


    }

    private static boolean isPrimeNumber(Integer number){
        IntPredicate doesNotModAndGetRemainderAsZero = rangeNumber -> (number % rangeNumber != 0);
        return IntStream.rangeClosed(2,(int)Math.sqrt(number)).allMatch( doesNotModAndGetRemainderAsZero);
    }


}
