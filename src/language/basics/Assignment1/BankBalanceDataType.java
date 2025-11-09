package language.basics.Assignment1;

public class BankBalanceDataType {
    public static void main(String[] args) {
        // Data Type: String (to include hyphens and treat it as text, not a number for calculation)
        String phoneNumber = "123-456-7890";

        System.out.println("Value: " + phoneNumber);
        System.out.println("Data Type: " + phoneNumber.getClass().getSimpleName());
    }
}
