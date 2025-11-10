public class AverageGrades {
    public static void main(String[] args) {
        int[][] grades = {
            {51, 83, 28},  // Alice
            {0, 38, 95}    // Bob
        };
        int[] weights = {30, 40, 30};

        int[] results = average_grades(grades, weights);

        int numStudents = results.length; // find the number of students 

        // Print result in the required format
        System.out.print("int[" + numStudents + "] { ");
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
            if (i < results.length - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static int[] average_grades(int[][] grades, int[] weights) {//function returning array
        int numStudents = grades.length;
        int numComponents = weights.length;
        int[] averages = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {  //iteratte through all students
            int total = 0;
            for (int j = 0; j < numComponents; j++) { //iterate through all scores and weightings
                total += grades[i][j] * weights[j];//totals all the calculated grades*scores for all weightings and entries
            }
            averages[i] = total / 100; // int division = round down
        }

        return averages;
    }
}
// comments so gitlab recognizes file change