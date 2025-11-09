package language.basics.Assignment2;

public class MultiDimArrayExample {
    public static void main(String[] args) {
        // Define a 3D array: [semester][subject][name/status]
        String[][][] data = {
            {   // Semester 1
                {"Mathematics I", "Pass(78)"},
                {"Physics", "Pass(88)"},
                {"Chemistry", "Pass(89)"},
                {"Computer Programming", "Pass(90)"},
                {"Engineering Physics", "Pass(88)"},
                {"Basic Electrical Eng.", "Pass(87)"}
            },
            {   // Semester 2
                {"Mathematics II", "Pass(88)"},
                {"Mechanics", "Pass(86)"},
                {"Environmental Sci.", "Pass(85)"},
                {"Basic Electronics", "Pass(90)"},
                {"Engineering Physics", "Pass(88)"},
                {"Engineering Graphics", "Pass(87)"}
            },
            {   // Semester 3
                {"Mathematics III", "Pass(89)"},
                {"Digital Electronics", "Pass(85)"},
                {"Data Structures", "Pass(86)"},
                {"Microprocessors", "Pass(90)"},
                {"Operating Systems", "Pass(86)"},
                {"DBMS", "Pass(88)"}
            },
            {   // Semester 4
                {"Probability & Statistics", "Pass(88)"},
                {"Computer Design", "Pass(86)"},
                {"Theory of Computation", "Pass(85)"},
                {"Embedded Systems", "Pass(90)"},
                {"Computer Graphics", "Pass(88)"},
                {"Group Communication", "Pass(87)"}
            }
        };

        // --- Required Outputs ---
        // Semester 2 → index 1
        System.out.println("Semester 2 Subject 4: " + data[1][3][0]); // Basic Electronics
        System.out.println("Semester 2 Subject 5: " + data[1][4][0]); // Engineering Physics

        // Semester 4 → index 3
        System.out.println("Semester 4 Subject 3 Status/Marks: " + data[3][2][1]); // Pass(85)
        System.out.println("Semester 4 Subject 6 Status/Marks: " + data[3][5][1]); // Pass(87)
    }
}
