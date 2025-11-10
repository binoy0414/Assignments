package Assignment;

public class FollowersDataType {
    public static void main(String[] args) {
        // Data Type: int (since followers are counted in whole numbers)
        int numberOfFollowers = 1000000;

        System.out.println("Value: " + numberOfFollowers);
        System.out.println("Data Type: " + ((Object)numberOfFollowers).getClass().getSimpleName());
    }
}
