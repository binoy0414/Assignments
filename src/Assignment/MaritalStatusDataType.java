package Assignment;

public class MaritalStatusDataType {
    public static void main(String[] args) {
        // Data Type: boolean (for a simple yes/no or true/false state)
        boolean isMarried = false;

        System.out.println("Value: " + isMarried);
        System.out.println("Data Type: " + ((Object)isMarried).getClass().getSimpleName());
    }
}
