package Assignment;

public class MovieRatingDataType {
    public static void main(String[] args) {
        // Data Type: double (Java prefers double for decimal numbers)
        double movieRating = 7.5;

        System.out.println("Value: " + movieRating);
        System.out.println("Data Type: " + ((Object)movieRating).getClass().getSimpleName());
    }
}
