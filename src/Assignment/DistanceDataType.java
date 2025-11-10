package Assignment;

public class DistanceDataType {
    public static void main(String[] args) {
        // Data Type: double (Java prefers double for decimal precision)
        double distanceMiles = 200.5;

        System.out.println("Value: " + distanceMiles);
        System.out.println("Data Type: " + ((Object)distanceMiles).getClass().getSimpleName());
    }
}
