package language.basics.Assignment1;

public class CurrentYearDataType {
    public static void main(String[] args) {
        // Data Type: int (for a whole, non-decimal number)
        int currentYear = 2023;

        System.out.println("Value: " + currentYear);
        System.out.println("Data Type: " + ((Object)currentYear).getClass().getSimpleName());
    }
}
