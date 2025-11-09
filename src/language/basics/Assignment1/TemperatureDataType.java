package language.basics.Assignment1;

public class TemperatureDataType {
    public static void main(String[] args) {
        // Data Type: float (for decimal numbers)
        float temperatureCelsius = 25.5f;

        System.out.println("Value: " + temperatureCelsius);
        System.out.println("Data Type: " + ((Object)temperatureCelsius).getClass().getSimpleName());
    }
}
