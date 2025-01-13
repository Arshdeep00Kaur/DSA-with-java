package patteren_ques;

public class pascals_triangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for Pascal's Triangle

        for (int i = 0; i < n; i++) {  // Outer loop for each row
            // Print leading spaces for formatting the triangle
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Numbers in Pascal's Triangle
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");  // Print the number
                number = number * (i - j) / (j + 1);  // Update the number for the next element
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
