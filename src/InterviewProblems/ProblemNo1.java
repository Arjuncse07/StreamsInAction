package InterviewProblems;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemNo1 {
/* we have
String s1 = "Aadi";
String s2 = "Java";

want output : AJaadvia   */

    public static void main(String[] args) {

        String s1 = "Aadi";
        String s2 = "Java";

        // Create two streams, one for each string, and alternate the characters
        String result = IntStream.range(0, Math.max(s1.length(), s2.length()))
                .mapToObj( i -> {
                    String part1 = ( i <s1.length()) ? String.valueOf(s1.charAt(i)) : "";
                    String part2 = ( i <s2.length()) ? String.valueOf(s2.charAt(i)) : "";
                    return part1+part2;
                        }).collect(Collectors.joining());


        System.out.println(result); // Output: AJaadvia



    }

}
