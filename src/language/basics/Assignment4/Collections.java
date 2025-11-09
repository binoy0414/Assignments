/**
 * Assignment 4: Arrays and Collections
 * This program demonstrates the use of List (ArrayList), Set (HashSet),
 * and standard primitive arrays to solve various data management tasks.
 *
 * To compile: javac Assignment4_Collections.java
 * To run: java wamis.assignment.Assignment4_Collections
 */
package language.basics.Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Collections {


    public static void main(String[] args) {
        System.out.println("--- Assignment 4: Arrays and Collections ---");
        System.out.println("----------------------------------------------\n");

        // --- 1. Lists: Top 5 Largest Cities Area ---
        System.out.println("1. City Area Calculation (Using List):");

        // Create a List to store the areas (in square kilometers)
        List<Double> cityAreasKm2 = new ArrayList<>();
        cityAreasKm2.add(38000.0); // Shanghai
        cityAreasKm2.add(32000.0); // Beijing
        cityAreasKm2.add(28000.0); // London (3rd largest)
        cityAreasKm2.add(25000.0); // Tokyo (4th largest)
        cityAreasKm2.add(22000.0); // New York

        // Lists are zero-indexed: 3rd city is at index 2, 4th city is at index 3.
        double area3rdCity = cityAreasKm2.get(2);
        double area4thCity = cityAreasKm2.get(3);
        
        double totalCombinedArea = area3rdCity + area4thCity;

        System.out.printf("  - Area of 3rd city (Index 2): %.1f sq km\n", area3rdCity);
        System.out.printf("  - Area of 4th city (Index 3): %.1f sq km\n", area4thCity);
        System.out.printf("  - Total combined area: %.1f sq km\n\n", totalCombinedArea);


        // --- 2. Sets: Top 10 Most Visited Tourist Attractions ---
        System.out.println("2. Tourist Attractions (Using Set):");

        // Create a Set (HashSet) to store attraction names. Sets do not allow duplicates.
        Set<String> touristAttractions = new HashSet<>();
        touristAttractions.add("Great Wall of China");
        touristAttractions.add("Colosseum");
        touristAttractions.add("Eiffel Tower");
        touristAttractions.add("Statue of Liberty");
        touristAttractions.add("Times Square");
        touristAttractions.add("Louvre Museum");
        touristAttractions.add("Pyramids of Giza");
        touristAttractions.add("Forbidden City");
        touristAttractions.add("Machu Picchu");
        touristAttractions.add("Sydney Opera House");

        // Print all attractions
        System.out.println("  - All 10 attractions:");
        for (String attraction : touristAttractions) {
            System.out.println("    > " + attraction);
        }

        // Print the size
        System.out.println("\n  - Total number of attractions (Set Size): " + touristAttractions.size() + "\n");


        // --- 3. Arrays: Average of 5th and 6th Number ---
        System.out.println("3. Array Calculation (Using Primitive Array):");
        
        // Create an array of 10 integer numbers
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Arrays are zero-indexed: 5th value is at index 4, 6th value is at index 5.
        int fifthValue = numbers[4];
        int sixthValue = numbers[5];
        
        // Calculate the average
        double average = (double) (fifthValue + sixthValue) / 2;
        
        System.out.println("  - Array: " + Arrays.toString(numbers));
        System.out.println("  - 5th Value (Index 4): " + fifthValue);
        System.out.println("  - 6th Value (Index 5): " + sixthValue);
        System.out.printf("  - Average of 5th and 6th value: %.1f\n\n", average);


        // --- 4. Lists: Top 5 Highest-Grossing Movies ---
        System.out.println("4. Movie Retrieval (Using List):");

        // Create a List to store the movie titles (order matters in a List)
        List<String> topMovies = new ArrayList<>();
        topMovies.add("Avatar");                     // 1st
        topMovies.add("Avengers: Endgame");          // 2nd
        topMovies.add("Avatar: The Way of Water");   // 3rd
        topMovies.add("Titanic");                    // 4th
        topMovies.add("Star Wars: The Force Awakens"); // 5th

        // Lists are zero-indexed: the third movie is at index 2.
        String thirdMovie = topMovies.get(2);

        System.out.println("  - Top 5 List: " + topMovies);
        System.out.println("  - The third movie on the list (Index 2) is: " + thirdMovie);

        System.out.println("\n----------------------------------------------");
    }
}