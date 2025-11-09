
/**
 * Assignment: Multi-Dimensional Array Practice
 * This program demonstrates how to define, initialize, and access data
 * within a 3-Dimensional (3D) String array to represent student grades.
 *
 * Array Structure: String[Semester][Data_Type][Subject]
 * [i][0][j] -> Subject Name
 * [i][1][j] -> Status (Marks)
 *
 * To compile: javac MultiDimensionalArrayAssignment.java
 * To run: java MultiDimensionalArrayAssignment
 */
package language.basics.Assignment2;

public class MultiDimensionalArrayAssignment {



    public static void main(String[] args) {
        // 1. Create a 3D array to represent the data.
        // Dimensions: [5 Semesters] x [2 Data Types (Name/Status)] x [6 Subjects]
        String[][][] gradeData = new String[5][2][6];

        // --- Semester 1 (Index 0) ---
        // Subject Names (Index [0])
        gradeData[0][0][0] = "Mathematics I";
        gradeData[0][0][1] = "Physics";
        gradeData[0][0][2] = "Chemistry";
        gradeData[0][0][3] = "Computer Programming";
        gradeData[0][0][4] = "Engineering Drawing";
        gradeData[0][0][5] = "Basic Electrical Eng.";
        // Status/Marks (Index [1])
        gradeData[0][1][0] = "Pass(78)";
        gradeData[0][1][1] = "Pass(85)";
        gradeData[0][1][2] = "Fail(21)";
        gradeData[0][1][3] = "Pass(74)";
        gradeData[0][1][4] = "Pass(88)";
        gradeData[0][1][5] = "Pass(79)";

        // --- Semester 2 (Index 1) ---
        // Subject Names (Index [0])
        gradeData[1][0][0] = "Mathematics II";
        gradeData[1][0][1] = "Mechanics";
        gradeData[1][0][2] = "Environmental Sci.";
        gradeData[1][0][3] = "Basic Electronics";
        gradeData[1][0][4] = "Engineering Physics";
        gradeData[1][0][5] = "Engineering Graphics";
        // Status/Marks (Index [1])
        gradeData[1][1][0] = "Pass(82)";
        gradeData[1][1][1] = "Pass(77)";
        gradeData[1][1][2] = "Pass(93)";
        gradeData[1][1][3] = "Fail(19)";
        gradeData[1][1][4] = "Fail(24)";
        gradeData[1][1][5] = "Pass(90)";

        // --- Semester 3 (Index 2) ---
        // Subject Names (Index [0])
        gradeData[2][0][0] = "Data Structures";
        gradeData[2][0][1] = "Discrete Mathematics";
        gradeData[2][0][2] = "Digital Electronics";
        gradeData[2][0][3] = "Operating Systems";
        gradeData[2][0][4] = "Signals and Systems";
        gradeData[2][0][5] = "Object-Oriented Prog.";
        // Status/Marks (Index [1])
        gradeData[2][1][0] = "Pass(88)";
        gradeData[2][1][1] = "Pass(81)";
        gradeData[2][1][2] = "Pass(76)";
        gradeData[2][1][3] = "Fail(32)";
        gradeData[2][1][4] = "Pass(85)";
        gradeData[2][1][5] = "Pass(78)";

        // --- Semester 4 (Index 3) ---
        // Subject Names (Index [0])
        gradeData[3][0][0] = "Algorithms";
        gradeData[3][0][1] = "Computer Networks";
        gradeData[3][0][2] = "Database Systems";
        gradeData[3][0][3] = "Microprocessors";
        gradeData[3][0][4] = "Communication Eng.";
        gradeData[3][0][5] = "Software Engineering";
        // Status/Marks (Index [1])
        gradeData[3][1][0] = "Pass(91)";
        gradeData[3][1][1] = "Pass(73)";
        gradeData[3][1][2] = "Fail(19)";
        gradeData[3][1][3] = "Pass(80)";
        gradeData[3][1][4] = "Pass(76)";
        gradeData[3][1][5] = "Pass(87)";

        // --- Semester 5 (Index 4) ---
        // Subject Names (Index [0])
        gradeData[4][0][0] = "Probability & Stats";
        gradeData[4][0][1] = "Machine Learning";
        gradeData[4][0][2] = "Compiler Design";
        gradeData[4][0][3] = "Theory of Computation";
        gradeData[4][0][4] = "Embedded Systems";
        gradeData[4][0][5] = "Computer Graphics";
        // Status/Marks (Index [1])
        gradeData[4][1][0] = "Pass(86)";
        gradeData[4][1][1] = "Pass(88)";
        gradeData[4][1][2] = "Pass(84)";
        gradeData[4][1][3] = "Pass(95)";
        gradeData[4][1][4] = "Pass(73)";
        gradeData[4][1][5] = "Pass(90)";

        System.out.println("--- Multi-Dimensional Array Data Retrieval ---");
        System.out.println("----------------------------------------------");

        // 2. Perform Retrieval Queries

        // Query A: Print Semester 2 Subject 4 and Subject 5 names.
        // Indexing: [Semester 2 is 1] [Subject Name is 0] [Subject 4 is 3, Subject 5 is 4]
        String sem2_sub4_name = gradeData[1][0][3];
        String sem2_sub5_name = gradeData[1][0][4];

        System.out.println("Query A: Semester 2 Subject Names");
        System.out.println("  - Subject 4: " + sem2_sub4_name);
        System.out.println("  - Subject 5: " + sem2_sub5_name);
        System.out.println();


        // Query B: Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
        // Indexing: [Semester 4 is 3] [Status/Marks is 1] [Subject 3 is 2, Subject 6 is 5]
        String sem4_sub3_status = gradeData[3][1][2];
        String sem4_sub6_status = gradeData[3][1][5];

        System.out.println("Query B: Semester 4 Status/Marks");
        System.out.println("  - Subject 3 Status: " + sem4_sub3_status);
        System.out.println("  - Subject 6 Status: " + sem4_sub6_status);
        System.out.println("----------------------------------------------");
    }
}