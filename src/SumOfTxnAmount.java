import helper.Transaction;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfTxnAmount {

    /*
    5.2 Given a list of transactions, find the sum of transaction amounts for each day using Java streams:

List<Transaction> transactions = Arrays.asList(
    new Transaction("2022-01-01", 100),
    new Transaction("2022-01-01", 200),
    new Transaction("2022-01-02", 300),
    new Transaction("2022-01-02", 400),
    new Transaction("2022-01-03", 500)
);

     */



    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01",100),
                new Transaction("2022-01-01",200),
                new Transaction("2022-01-02",300),
                new Transaction("2022-01-02",400),
                new Transaction("2022-01-03",500)
        );

        Map<String,Integer> map = transactions.stream()
                .collect(
                        Collectors.groupingBy( Transaction::getTxnDate,
                                LinkedHashMap::new,
                                Collectors.summingInt(Transaction::getTxnAmount)));

        System.out.println("Map :: "+map);
    }





}
