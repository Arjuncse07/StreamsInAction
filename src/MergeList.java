import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {

    public static void main(String[] args) {

        List<Integer> finalList = new ArrayList<>();

        List<Integer> evenNumbers = Arrays.asList(3,5,17,13);
        List<Integer> oddNumbers = Arrays.asList(2,10,12,16,18);

        // Merging List using  streams
        finalList = Stream.concat(
                evenNumbers.stream(), oddNumbers.stream()
        ).collect(Collectors.toList());

        System.out.println("Merged List came :::: "+finalList);


        /* Merge Two List without streams*/
        List<Integer> finalWithoutStreamsList = new ArrayList<>(evenNumbers);
        finalWithoutStreamsList.addAll(oddNumbers);

        System.out.println("Merged List Without Streams ::: "+finalWithoutStreamsList);




    }

}
