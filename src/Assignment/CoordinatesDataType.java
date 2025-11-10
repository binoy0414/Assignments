package language.basics;

public class CoordinatesDataType {
    public static void main(String[] args) {
        // Data Type: double (for decimal precision)
        // Using an array to store the two related values (latitude, longitude)
        double[] locationCoordinates = {37.7749, -122.4194};

        System.out.println("Value: (" + locationCoordinates[0] + ", " + locationCoordinates[1] + ")");
        System.out.println("Data Type: " + locationCoordinates.getClass().getSimpleName());
    }
}
