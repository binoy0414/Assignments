package language.basics.Assignment3;

/**
 * Handles employee data processing:
 * - Copies data into local arrays
 * - Prints formatted employee information
 */
public class EmpGroups {
    public static void main(String[] args) {
        System.out.println("--- Assignment 3: Employee Data Processing ---");
        
        Employees employeeData = new Employees();
        String[] names = employeeData.getEmployeeNames();
        int[] ids = employeeData.getEmployeeIDs();

        // Copy data (demo of array copying)
        String[] groupNamesArray = new String[names.length];
        int[] groupIDsArray = new int[ids.length];
        System.arraycopy(names, 0, groupNamesArray, 0, names.length);
        System.arraycopy(ids, 0, groupIDsArray, 0, ids.length);

        System.out.println("Data successfully loaded (" + groupNamesArray.length + " employees).\n");

        // Print employee details
        System.out.println("--- Final Employee List ---");
        for (int i = 0; i < groupNamesArray.length; i++) {
            System.out.printf("• Employee Name: %s, Employee ID: %d%n", groupNamesArray[i], groupIDsArray[i]);
        }
        System.out.println("---------------------------");
    }
}

