import java.util.Scanner;
// comments so gitlab recognizes file change
public class SevenSegment {
    // array of ASCII art for digits 0–9
    private static String[][] DIGITS = {
        { " _ ",
          "| |",
          "|_|" }, // 0
        { "   ",
          "  |",
          "  |" }, // 1
        { " _ ",
          " _|",
          "|_ " }, // 2
        { " _ ",
          " _|",
          " _|" }, // 3
        { "   ",
          "|_|",
          "  |" }, // 4
        { " _ ",
          "|_ ",
          " _|" }, // 5
        { " _ ",
          "|_ ",
          "|_|" }, // 6
        { " _ ",
          "  |",
          "  |" }, // 7
        { " _ ",
          "|_|",
          "|_|" }, // 8
        { " _ ",
          "|_|",
          " _|" }  // 9
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");// int input
        int number = in.nextInt();
        in.close();

        String n = Integer.toString(number);
        
        displayint(n);
    }

    static void displayint(String n) {
        // Build the three display rows
        StringBuilder row1 = new StringBuilder();
        StringBuilder row2 = new StringBuilder();
        StringBuilder row3 = new StringBuilder();

        for (char c : n.toCharArray()) { //for char in char array(str) convert then parse from string array
            int d = c - '0';
            row1.append(DIGITS[d][0]).append(' ');
            row2.append(DIGITS[d][1]).append(' ');
            row3.append(DIGITS[d][2]).append(' ');
        }

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
    }
}
