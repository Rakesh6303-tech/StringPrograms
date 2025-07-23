package com.string.programs;

import java.util.Scanner;

public class Add_Astrisks_Before_a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		Add_Astrisks_Before_a(input);

	}
	static void Add_Astrisks_Before_a(String input)
	{
		String t = "";
	
  for (int i=0;i<input.length();i++)
		{
			char ch = input.charAt(i);
			if(ch=='A' || ch=='a')
			{
				t = t+"*"+ch;
			}
			else
			{
				t = t+ch;
			}
					
		}
	System.out.print(t);
	}

}
