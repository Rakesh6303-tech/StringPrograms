package com.string.programs;
import java.util.*;
public class Count_Words_in_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		CountString(s);
	}
	static void CountString(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}	
		}
		System.out.print(count);
	}

}
