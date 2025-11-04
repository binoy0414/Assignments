package language.basics;

public class EmailAddressDataType {
    public static void main(String[] args) {
        // Data Type: String (for sequences of characters)
        String emailAddress = "john.doe@example.com";

        System.out.println("Value: " + emailAddress);
        System.out.println("Data Type: " + emailAddress.getClass().getSimpleName());
    }
}
