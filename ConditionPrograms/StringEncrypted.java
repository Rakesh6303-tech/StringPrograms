package conditionBasedPrograms;
import java.util.*;
public class Unchanged {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().toLowerCase();
		int k = scan.nextInt();
		Unchaged(s,k);
	}
	static void Unchaged(String s,int k)
	{
		StringBuilder result = new StringBuilder();
		for(char ch:s.toCharArray())
		{
			if(ch>='a'&& ch<='z')
			{
				char encrypted = (char)((ch-'a'+k)%26+'a');
				result.append(encrypted);
			}
			else {
				result.append(ch);
			}
		}
		System.out.println(result.toString());
}
}
