package conditionBasedPrograms;
import java.util.*;
public class SortWithoutDuplicates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		SortWithoutDuplicate(s);
	}
	static void SortWithoutDuplicate(String s)
	{
		int ar [] =new int [s.length()];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=s.charAt(i);
		}
		sorrtString(ar);
	}
	static void sorrtString(int ar [])
	{
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		char prev=0;// To keep track of last printed character
		for(int i=0;i<ar.length;i++)
		{
			char current = (char)ar[i];
			if(current != prev)// Print only if it's not a duplicate
			{
				System.out.print(current);
				prev=current;
			}
		}
	}

}
