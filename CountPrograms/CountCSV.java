// Write a program count vowels,consonants,special characters in given string
 package programs;
import java.util.*;
public class CountVCSPC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		countvcsp(s);
	}
	static void countvcsp(String s)
	{
		int vowelcount=0,consonantcount=0,spc=0;
		for(int i=0;i<s.length();i++)
		{
			// Convert String To Character
			char ch = s.charAt(i); 
			// Initial Check It is Alphabetic
			if(ch>='A'&& ch<='Z'|| ch>='a' && ch<='z')   
			{
				// Checking Vowels
				if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'||
						ch=='E'||ch=='I'||ch=='O'||ch=='U')   
				{
					// Vowelcount Increment
					vowelcount++;
				}
				// Else ConsonantCount Increment
				else {
					consonantcount++;
				}
			}
			// Not Letter or Digit---> Definetly it is Special Character
			else if(!Character.isLetterOrDigit(ch))
			{
				// SpC Character Increment
				spc++;
			}
	}
		System.out.println("Vowels: "+vowelcount);
		System.out.println("Consonants: "+consonantcount);
		System.out.println("specialCharCount "+ spc);

}
}
