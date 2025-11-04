package language.basics.Assignment1;

public class EmployeesDataType {
    public static void main(String[] args) {
        // Data Type: int (since employees are counted in whole numbers)
        int numberOfEmployees = 500;

        System.out.println("Value: " + numberOfEmployees);
        System.out.println("Data Type: " + ((Object)numberOfEmployees).getClass().getSimpleName());
    }
}
