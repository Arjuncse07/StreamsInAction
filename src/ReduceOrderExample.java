import streams.helper.Order;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReduceOrderExample {

    /*
    List<Order> orders = Arrays.asList(
            new Order("ORD001", "CUST01", 150.75),
            new Order("ORD002", "CUST02", 250.40),
            new Order("ORD003", "CUST01", 75.30),
            new Order("ORD004", "CUST03", 120.20),
            new Order("ORD005", "CUST01", 180.00),
            new Order("ORD006", "CUST02", 350.50),
            new Order("ORD007", "CUST02", 275.80)
        );

        // Task 1: Calculate total expenditure per customer using reduce()
        // Task 2: Find the highest value order using reduce()
        // Output the results

     */

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("ORD001", "CUST01", 150.75),
                new Order("ORD002", "CUST02", 250.40),
                new Order("ORD003", "CUST01", 75.30),
                new Order("ORD004", "CUST03", 120.20),
                new Order("ORD005", "CUST01", 180.00),
                new Order("ORD006", "CUST02", 350.50),
                new Order("ORD007", "CUST02", 275.80)
        );

        // Task 1: Calculate total expenditure per customer using reduce()
        Map<String,Double> customerExpenditure  = orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomerId,
                        Collectors.reducing(0.0, Order::getOrderTotal, Double::sum)));
        System.out.println(" customerExpenditure ::  "+customerExpenditure);


        // Task 2: Find the highest value order using reduce()
        Order highestOrderValue= orders.stream()
                .reduce( (order1, order2) -> order1.getOrderTotal() > order2.getOrderTotal() ? order1 : order2)
                .orElse(null);

        System.out.println(" highestOrderValue :: "+highestOrderValue.getCustomerId());


        // Task:3 Return a Map where the key is the customer ID, and the value is their total expenditure for the month.



    }
}
