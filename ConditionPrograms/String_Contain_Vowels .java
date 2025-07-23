package com.string.programs;
import java.util.*;
public class String_Contain_Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		String_Contain_Vowels(input);
	}
	static void String_Contain_Vowels(String input)
	{
		boolean value =false;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='A' || input.charAt(i)=='E'||input.charAt(i)=='I' || input.charAt(i)=='O'||input.charAt(i)=='U'|| input.charAt(i)=='a' ||
				input.charAt(i)=='e' || input.charAt(i)=='i' ||input.charAt(i)=='o' || input.charAt(i)=='u')
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
