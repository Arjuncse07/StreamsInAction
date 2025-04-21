import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapObjectUsingStreams {

    /*
    You are given a Map<String, Integer> representing employee names and their ages. Write a Java program using Streams to:
Map<String, Integer> employees = new HashMap<>();
employees.put("Alice", 28);
employees.put("Bob", 35);
employees.put("Charlie", 32);
employees.put("David", 25);
employees.put("Eva", 29);

1.Filter out employees who are younger than 30.
2.Collect the filtered entries into a new Map.
3.Print the resulting map.
     */

    public static void main(String[] args) {

        Map<String, Integer> employees = new HashMap<>();
        employees.put("Alice", 28);
        employees.put("Bob", 35);
        employees.put("Charlie", 32);
        employees.put("David", 25);
        employees.put("Eva", 29);


        Map<String,Integer> filteredMap =employees.
                entrySet()
                .stream()
                .filter(employee -> employee.getValue() > 30).collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        // Storing the Employee Name into List<String> employeesName
          List<String> filterList = employees.entrySet().stream()
                        .filter(employee -> employee.getValue() > 30)
                        .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Filtered Map :: "+filteredMap);
        System.out.println("Filter List Of Names :: "+filterList);


    }


}
