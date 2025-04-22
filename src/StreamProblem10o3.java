import java.util.*;
import java.util.stream.Collectors;

public class StreamProblem10o3 {
/*
 "10.3 ""Given a list of strings, where each string represents a hierarchical structure of categories and products.
 Each string is formatted as category:product1,product2;category2:product3. You need to extract all the unique products and generate a
 map where the keys are the unique products and the values are lists of the categories they belong to. Ignore strings with invalid formats.
 If a product belongs to multiple categories, it should appear only once as a key, and its value should be a list of all its categories.""

List<String> input = Arrays.asList(
    ""Electronics:Laptop,Smartphone;Clothing:Shirt"",
    ""Books:Novel,Magazine;Electronics:Tablet"",
    ""Invalid String"",
    ""Clothing:Pants;Books:Novel""
);

INTO
{Laptop=[Electronics], Smartphone=[Electronics], Shirt=[Clothing], Novel=[Books], Magazine=[Books], Tablet=[Electronics], Pants=[Clothing]}
"
 */

    public static void main(String[] args) {

        List<String> inputList = Arrays.asList(
                "Electronics:Laptop,Smartphone;Clothing:Shirt",
                "Books:Novel,Magazine;Electronics:Tablet",
                "Invalid String",
                "Clothing:Pants;Books:Novel");

         Map<String, Set<String>> resultMap = inputList.stream()
                .filter( entry -> entry.contains(":") && entry.contains(";"))
                .flatMap(entry -> Arrays.stream(entry.split(";")))
                .map(section -> section.split(":"))
                .filter( parts -> parts.length == 2)
                .flatMap( parts -> {
                    String category = parts[0];
                    return Arrays.stream(parts[1].split(","))
                            .map(product -> new AbstractMap.SimpleEntry<>(product,category));
                })
                .collect(Collectors.groupingBy(
                       Map.Entry::getKey,
                       Collectors.mapping(
                               Map.Entry::getValue,
                               Collectors.toSet()  // Set will avoid duplicate categories
                       )
                ));

        System.out.println("Resulted Map :: "+resultMap);


    }
}
