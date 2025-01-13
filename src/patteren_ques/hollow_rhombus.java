package patteren_ques;

public class hollow_rhombus {
    public static void main(String[] args) {
        int n = 5;  // Size of the rhombus

        for (int i = 1; i <= n; i++) {
            // Printing leading spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Printing stars and spaces for hollow rhombus
            for (int j = 1; j <= n; j++) {
                // Print stars at the first and last position of each row
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  // Print spaces in the middle
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
