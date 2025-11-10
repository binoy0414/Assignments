package language.basics;

public class EventTimeDataType {
    public static void main(String[] args) {
        // Data Type: String (simplest representation; a LocalTime object would be used for calculations)
        String eventTime = "2:30 PM";

        System.out.println("Value: " + eventTime);
        System.out.println("Data Type: " + eventTime.getClass().getSimpleName());
    }
}
