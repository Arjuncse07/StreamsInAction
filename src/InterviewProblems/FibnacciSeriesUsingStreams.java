package InterviewProblems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibnacciSeriesUsingStreams {

    public static void main(String[] args) {
        int n =10;
        generateFibonacci(n).forEach(e -> System.out.println(e));
    }

    private static Stream<Long> generateFibonacci(int n) {
        return Stream.iterate(
                new long[]{0,1}, fib -> new long[]{fib[1], fib[0] + fib[1]}
        ).limit(n).map(fib -> fib[0]);
    }


}
