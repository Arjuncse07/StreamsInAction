package InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProblemNo06 {

    public static void main(String[] args) {

        /* String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
           Expected output (order may vary):
           [["eat","tea","ate"], ["tan","nat"], ["bat"]]
               group anagrams order not matter using streams   */


        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> groupedMap = Arrays.stream(arr).collect(Collectors.groupingBy(
                s -> {
                    char[] charArray = s.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }
        ));

        List<List<String>> result = new ArrayList<>(groupedMap.values());
        System.out.println(result);


    }

}
