/*
Step 1: Create Map<String, String> for each row of data * 
Step 2: Create List<Map<String, String>> for entire table 
Step 3: Create Map<String, List<Map<String,String>>> to store all 3 tables together 
Step 4: Print the data from Product details > Supplier Name > Office Depot from the Map<String,List<Map<String, String>>>*/

package language.basics.Assignment5;

import java.util.*;

public class TestCaseDataProcessor {
    public static void main(String[] args) {
        // Step 1: Create Map<String, String> for each row
        Map<String, String> row1 = new HashMap<>();
        row1.put("Product Name", "Printer");
        row1.put("Supplier Name", "Office Depot");
        row1.put("Price", "150");

        Map<String, String> row2 = new HashMap<>();
        row2.put("Product Name", "Monitor");
        row2.put("Supplier Name", "Best Buy");
        row2.put("Price", "200");

        Map<String, String> row3 = new HashMap<>();
        row3.put("Product Name", "Keyboard");
        row3.put("Supplier Name", "Office Depot");
        row3.put("Price", "50");

        // Step 2: Create List<Map<String, String>> for each TestCase
        List<Map<String, String>> testCase1 = Arrays.asList(row1, row2, row3);
        List<Map<String, String>> testCase2 = Arrays.asList(row1, row2, row3); // Simulated repeat
        List<Map<String, String>> testCase3 = Arrays.asList(row1, row2, row3); // Simulated repeat

        // Step 3: Create Map<String, List<Map<String, String>>> to store all TestCases
        Map<String, List<Map<String, String>>> allTestCases = new HashMap<>();
        allTestCases.put("Product Details", testCase1);
        allTestCases.put("Shipping Details", testCase2);
        allTestCases.put("Billing Details", testCase3);

        // Step 4: Print data from Product Details > Supplier Name > Office Depot
        System.out.println("Filtered rows from 'Product Details' where Supplier Name is 'Office Depot':");
        List<Map<String, String>> productDetails = allTestCases.get("Product Details");

        for (Map<String, String> row : productDetails) {
            if ("Office Depot".equalsIgnoreCase(row.get("Supplier Name"))) {
                System.out.println(row);
            }
        }
    }
}
