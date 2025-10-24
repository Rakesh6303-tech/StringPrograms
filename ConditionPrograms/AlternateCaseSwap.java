 */
 // Alternate case Swap
 // Input : STRinG PrOGRam
 // Output : strINg pRogrAM
 

import java.util.*;
public class AlternativeCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		AltrCase(s);
	}
	static void AltrCase(String s)
	{
		String t = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			// Check if the character 'ch' is an uppercase letter
			if (ch >= 'A' && ch <= 'Z') {
			    
			    // If 'ch' is uppercase, convert it to lowercase
			    // Adding 32 to an uppercase ASCII value converts it to lowercase
			    // For example: 'A' (65) + 32 = 'a' (97)
			    t = t + (char)(ch + 32);
			} 
			else {
			    // Otherwise, assume 'ch' is lowercase
			    // Subtracting 32 from a lowercase ASCII value converts it to uppercase
			    // For example: 'a' (97) - 32 = 'A' (65)
			    t = t + (char)(ch - 32);
			}

		}
		System.out.println(t);
	}

}

