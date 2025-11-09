package language.basics;

public class DebugTheProgram {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("Step 1: Program starts");
		System.out.println("Step 2: Preparing to execute next step");
		System.out.println("Step 3: Performing calculations");

		// BEFORE MODIFICATION:
		int j = i - 1;

		// MODIFICATION: Ensure j is not zero.
		
		/*
		 * int j = i + 1; // Change to 'i + 1' so j is 2
		 */		 		 
		System.out.println("Step 4: Result of i / j is " + (i / j));
		System.out.println("Step 5: Program execution completed");
	}
}