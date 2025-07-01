import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestElementSum {

    /*
    "Given a list of strings, each representing a sequence of comma-separated integers,
find the sum of the unique second-largest integers across all the strings.
If any string has fewer than two valid integers, ignore it.
 Also, handle cases where the same second-largest integer appears in multiple strings, ensuring it's only summed once."

List<String> input = Arrays.asList(
    "10,5,20,15",
    "1,2,3",
    "5,5,8,7",
    "10,10,11",
    "4"
);
     */

    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "10,5,20,15",
                "1,2,3",
                "5,5,8,7",
                "10,10,11",
                "4"
        );


        /*int sum = input.stream()
                .map( str -> Arrays.stream(str.split(","))
                        .map(String::trim)
                        .filter(str1 -> !str1.isEmpty())
                        .map(Integer::parseInt)
                        .collect(Collectors.toSet()) //remove Duplicates
                )
                .filter( set -> set.size() >= 2) //every set contains more than one value inside it..
                .map(set -> {
                    List<Integer> sorted = set.stream()
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList());
                    return sorted.get(1); //second-largest
                })
                .collect(Collectors.toSet())
                .stream()
                .mapToInt(Integer::intValue)
                .sum();*/

       // System.out.println("Sum of unique second-largest values :: "+sum);



        //System.out.println(sumUniqueSecondLargest(input)); // Output: 22


       int numuber = input.stream()
                .map(e->Arrays.stream(e.split(","))
                        .map(String::trim)
                        .filter(str -> !str.isEmpty())
                        .map(Integer::parseInt)
                        .collect(Collectors.toSet())
                )
                .filter( set -> set.size() >= 2)
               .map(set -> {
                   List<Integer> sortedListOfIntegers= set.stream()
                           .sorted(Comparator.reverseOrder())
                           .collect(Collectors.toList());
                   return sortedListOfIntegers.get(1);

               }).collect(Collectors.toSet())
               .stream()
               .mapToInt(Integer::intValue)
               .sum();

        System.out.println("Number is given as :: "+numuber);


    }




}
