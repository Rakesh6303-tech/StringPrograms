Input : Rakesh
output : R****h

import java.util.*;

class Demo {

    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner scan = new Scanner(System.in);

        // Read the entire string entered by the user
        String s = scan.nextLine();

        // Call the masking function and pass the input string
        MaskingString(s);
    }

    // Method to mask the string by keeping only first and last characters visible
    static void MaskingString(String s) {

        // If string length is 1 or 2, no masking needed
        if (s.length() <= 2) {
            System.out.print(s);
            return; // exit the method
        }

        // Get first character of the string
        char first = s.charAt(0);

        // Get last character of the string
        char last = s.charAt(s.length() - 1);

        // Create stars (*) for middle characters
        // Example: length 6 → middle = 4 → "****"
        String stars = "*".repeat(s.length() - 2);

        // Combine first character + stars + last character
        String res = first + stars + last;

        // Print the masked result
        System.out.print(res);
    }
}
