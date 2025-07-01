package InterviewProblems;

import java.util.Random;
import java.util.stream.IntStream;

public class Print1to100EvenNumbers {

    public static void main(String[] args) {

        /* Print 1 to 100 even numbers using java 8 */

        //Random randomNumber = new Random();
        //IntStream limit = randomNumber.ints().limit(100);

        IntStream.rangeClosed(1,100).filter(e -> e%2 ==0)
                .forEach(System.out::println);


    }

}
