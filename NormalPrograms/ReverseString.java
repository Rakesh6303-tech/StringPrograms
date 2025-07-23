package com.string.programs;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		ReverseString(s);
	}
	static void ReverseString(String s)
	{
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			t += ch;
		}
		System.out.print(t);
	}

}
