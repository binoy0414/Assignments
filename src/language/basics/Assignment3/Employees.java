package language.basics.Assignment3;

/**
 * Stores employee names and IDs.
 */
class Employees {
    // Declared as private for better encapsulation; provide getters if needed
    private final String[] employeeNames = {"Bharath", "John", "Aarav"};
    private final int[] employeeIDs = {1234, 1235, 1236};

    public String[] getEmployeeNames() {
        return employeeNames;
    }

    public int[] getEmployeeIDs() {
        return employeeIDs;
    }
}

