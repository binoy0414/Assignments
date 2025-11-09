	/**
	 * Assignment 1: Data Types
	 * This program demonstrates the correct use of Java's primitive and reference
	 * data types (boolean, int, long, double, char, and String) for various
	 * real-world data points.
	 *
	 * To compile: javac DataTypeAssignment.java
	 * To run: java DataTypeAssignment
	 */

package language.basics.Assignment1;

public class DataTypeAssignment {


	    public static void main(String[] args) {
	        System.out.println("--- Data Type Assignment Results ---");
	        System.out.println("------------------------------------");

	        // 1. Temperature of a city in degrees Celsius: 25.5
	        // Data Type: double (for decimal numbers that require high precision)
	        double cityTemperature = 25.5;
	        System.out.printf("1. Temperature (double): %.1f°C\n", cityTemperature);

	        // 2. Whether a customer has placed an order: true or false
	        // Data Type: boolean (for simple true/false logical states)
	        boolean hasPlacedOrder = true;
	        System.out.println("2. Has Placed Order (boolean): " + hasPlacedOrder);

	        // 3. Person's phone number: "123-456-7890"
	        // Data Type: String (used for text, especially when the number is not used in mathematical calculations)
	        String phoneNumber = "123-456-7890";
	        System.out.println("3. Phone Number (String): " + phoneNumber);

	        // 4. Amount of money in a customer's bank account: 1000.50
	        // Data Type: double (for currency, which is a decimal value)
	        double bankBalance = 1000.50;
	        System.out.printf("4. Bank Balance (double): $%.2f\n", bankBalance);

	        // 5. Person's email address: "john.doe@example.com"
	        // Data Type: String (for a sequence of characters/text)
	        String emailAddress = "john.doe@example.com";
	        System.out.println("5. Email Address (String): " + emailAddress);

	        // 6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
	        // Data Type: Two doubles (for two decimal numbers representing position)
	        double latitude = 37.7749;
	        double longitude = -122.4194;
	        System.out.printf("6. Coordinates (double): Lat %.4f, Lon %.4f\n", latitude, longitude);

	        // 7. Person's marital status: true or false
	        // Data Type: boolean (for simple true/false states)
	        boolean isMarried = false;
	        System.out.println("7. Marital Status (boolean): " + isMarried);

	        // 8. Person's occupation: "Software Engineer"
	        // Data Type: String
	        String occupation = "Software Engineer";
	        System.out.println("8. Occupation (String): " + occupation);

	        // 9. Person's favourite colour: "Blue"
	        // Data Type: String
	        String favouriteColour = "Blue";
	        System.out.println("9. Favourite Colour (String): " + favouriteColour);

	        // 10. Current year: 2023
	        // Data Type: int (for a standard, non-decimal whole number)
	        int currentYear = 2023;
	        System.out.println("10. Current Year (int): " + currentYear);

	        // 11. Number of followers on a social media platform: 1,000,000
	        // Data Type: int is sufficient, but long is safer for numbers that might exceed 2 billion
	        long numberOfFollowers = 1_000_000L; // The 'L' suffix indicates a long literal
	        System.out.println("11. Followers (long): " + numberOfFollowers);

	        // 12. Rating of a movie: 7.5
	        // Data Type: double (for decimal ratings)
	        double movieRating = 7.5;
	        System.out.println("12. Movie Rating (double): " + movieRating);

	        // 13. Person's blood type: 'A'
	        // Data Type: char (for a single character, enclosed in single quotes)
	        char bloodType = 'A';
	        System.out.println("13. Blood Type (char): " + bloodType);

	        // 14. Title of a book: "To Kill a Mockingbird"
	        // Data Type: String
	        String bookTitle = "To Kill a Mockingbird";
	        System.out.println("14. Book Title (String): " + bookTitle);

	        // 15. Number of employees in a company: 500
	        // Data Type: int (a whole number that won't exceed the int limit)
	        int numberOfEmployees = 500;
	        System.out.println("15. Number of Employees (int): " + numberOfEmployees);

	        // 16. Time of an event: 2:30 PM
	        // Data Type: String (best for simple display unless you need time calculations, which would require objects like LocalTime)
	        String eventTime = "2:30 PM";
	        System.out.println("16. Event Time (String): " + eventTime);

	        // 17. Name of a country: "United States"
	        // Data Type: String
	        String countryName = "United States";
	        System.out.println("17. Country Name (String): " + countryName);

	        // 18. Person's eye color: "Brown"
	        // Data Type: String
	        String eyeColor = "Brown";
	        System.out.println("18. Eye Color (String): " + eyeColor);

	        // 19. Person's birthplace: "New York City"
	        // Data Type: String
	        String birthplace = "New York City";
	        System.out.println("19. Birthplace (String): " + birthplace);

	        // 20. Distance between two cities: 200.5
	        // Data Type: double (for decimal values of distance)
	        double distanceKm = 200.5;
	        System.out.println("20. Distance (double): " + distanceKm + " km");

	        System.out.println("------------------------------------");
	    }
	}

