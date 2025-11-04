package language.basics;
import java.io.PrintWriter;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to Automation Training.");
        System.out.printf("Name: %s, Age: %d%n", "Binoy", 42);
     // → Output: Name: Binoy, Age: 42
        System.err.println("Error: Something went wrong!");
        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println("Hello via PrintWriter");
        writer.printf("Pi ≈ %.2f%n", Math.PI);
        System.out.format("Speed: %.2f km/h%n", 88.567);
        String msg = String.format("User %s has %d points", "Binoy", 1200);
        System.out.println(msg);

    }
}

