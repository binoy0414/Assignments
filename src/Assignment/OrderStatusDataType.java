package Assignment;

public class OrderStatusDataType {
    public static void main(String[] args) {
        // Data Type: boolean (for logical true/false states)
        boolean hasPlacedOrder = true;

        System.out.println("Value: " + hasPlacedOrder);
        System.out.println("Data Type: " + ((Object)hasPlacedOrder).getClass().getSimpleName());
    }
}
