package helper;

public class Order {

    private String orderId;
    private String customerId;
    private double orderTotal;

    public Order(String orderId, String customerId, double orderTotal) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderTotal = orderTotal;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}
