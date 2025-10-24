package conditionBasedPrograms;
import java.util.*;
public class LowerToUpper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Upper(s);
	}
	static void Upper(String s)
	{
		String t ="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			// For Lower To Upper
			if(ch>='a' && ch<='z')
				{
					t = t + (char)(ch-32);
				}
			// For Upper to Lower
//			if(ch>='A' && ch<='Z')
//			{
//				t = t + (char)(ch+32);
//			}
		}
		System.out.print(t);
	}

}
