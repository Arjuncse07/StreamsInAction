import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValuesUsingStreams {

    public static void main(String[] args) {

        Map<String, Integer> servicesMap = new HashMap<>();
        servicesMap.put("Artillery", 10005);
        servicesMap.put("DSC", 10006);
        servicesMap.put("Army_Unit1", 10007);
        servicesMap.put("Army_Unit2", 10008);
        servicesMap.put("CoastGuards", 10009);
        servicesMap.put("CGDA", 10010);
        servicesMap.put("SortCommision", 10011);
        servicesMap.put("PavillionUnit", 10012);
        servicesMap.put("PioneerUnit", 10013);
        servicesMap.put("LeapordUnit", 10014);
        servicesMap.put("NavalDockyardUnit", 10015);
        servicesMap.put("NavyPoliceUnit", 10016);
        servicesMap.put("MarineCommmandoUnit", 10017);
        servicesMap.put("GoodsDeployUnit", 10018);
        servicesMap.put("FrontierUnit", 10019);
        servicesMap.put("NightGuards", 10020);


        // Now we have to sort the map using Key

        Map<String, Integer> sortedServicesMap = servicesMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));

        System.out.println("Sorted Map :: " + sortedServicesMap);

    }
}
