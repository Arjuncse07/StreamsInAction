import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMap {

    /*
Problem : 04 Sort a HashMap by Keys and Values using stream API

 */


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("apple",5); //tricky part here
        map.put("Apple",4);
        map.put("Litchi",1);
        map.put("Mango",2);
        map.put("Grapes",3);


        /* Comparing by Keys */
        Map<String,Integer> sortByKeyMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue,
                                (e1,e2) -> e1, LinkedHashMap::new

                        )
                );

        System.out.println("Sorted Map By Keys ::: "+sortByKeyMap);


        // sorted map by values
        Map<String,Integer> sortedMapByValues=  map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue,
                                (e1,e2) -> e1, LinkedHashMap::new
                        )
                );

        System.out.println("Sorted Map by values ::: "+sortedMapByValues);




    }

}
