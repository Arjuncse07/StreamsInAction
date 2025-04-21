import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTopFrequestWords {
    /*

    6.Find Top N Frequent Words in a Paragraph using Streams
String paragraph = "apple banana apple cherry banana apple grape grape grape orange banana apple"; { 1. Top 3 }

     */

    public static void main(String[] args) {

        String paragraph = "apple banana apple cherry banana apple grape grape grape orange banana apple";

        int topN = 3;

        List<String> topFrequentWords = Arrays.stream(paragraph.split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue())) //sort in descending order
                .limit(topN) // top 3 printed
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(" Top Frequent Words in Para :: " + topFrequentWords);


    }

}
