package com.string.programs;

import java.util.Scanner;

public class String_Contain_Consonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		check_consonants(input);
	}
	static void check_consonants(String input)
	{
		boolean value =false;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!='A' && input.charAt(i)!='E' && input.charAt(i)!='I'&& input.charAt(i)!='O'&&input.charAt(i)!='U'&& input.charAt(i)!='a' &&
				input.charAt(i)!='e' && input.charAt(i)!='i' &&input.charAt(i)!='o' && input.charAt(i)!='u')
			{
				
				value = true;
				break;
			}
		
		}
		if(value)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
