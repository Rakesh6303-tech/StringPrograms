package conditionBasedPrograms;   // Package name (like a folder for your Java classes)

import java.util.*;                // Importing Scanner class from java.util package for user input

public class SortTheString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   // Create Scanner object to take input from user
		String s = scan.nextLine();              // Read the input string from user
		SortString(s);                           // Call the method to sort the string
	}

	// Method to convert string into ASCII values and pass to sorting function
	public static void SortString(String s)
	{
		int ar [] = new int[s.length()];         // Create an integer array to store ASCII values of characters

		for(int i = 0; i < s.length(); i++)      // Loop through each character of the string
		{
			ar[i] = s.charAt(i);                 // Store ASCII value of each character in the array
		}

		sortArray(ar);                           // Call sorting function to sort the ASCII values
	}

	// Method to sort the array in ascending order (simple bubble/selection sort)
	static void sortArray(int ar[])
	{
		int temp = 0;                            // Temporary variable for swapping

		for(int i = 0; i < ar.length; i++)       // Outer loop for traversing the array
		{
			for(int j = i + 1; j < ar.length; j++)  // Inner loop for comparing elements
			{
				if(ar[i] > ar[j])                // If current element is greater than next one
				{
					temp = ar[i];                // Swap the two elements
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

		// Print the sorted characters by converting ASCII values back to characters
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print((char)(ar[i]));     // Convert ASCII back to character and print
		}
	}
}
