package com.string.programs;
import java.util.*;
public class CheckDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		if(CheckDigit(s))
		{
			System.out.println("String has Digits");
		}
		else
		{
			System.out.println("No elements");
		}
	}
	static boolean CheckDigit(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				return true;
			}
		}
		return false;
	}

}
