import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsWithFirstChr {

    /*
    5.Group Words by Their First Character using Stream API

List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "grape", "carrot", "blueberry");

Words starting with 'a': [apple, apricot]
Words starting with 'b': [banana, blueberry]
Words starting with 'c': [cherry, carrot]
Words starting with 'g': [grape]
     */


    public static void main(String[] args) {


        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "grape", "carrot", "blueberry");

       Map<Character,List<String>> map = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(map);


    }




}
