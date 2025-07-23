package com.string.programs;
import java.util.*;
public class Print_All_Characters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Print_ALL_Chara(input);
	}
	static void Print_ALL_Chara(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			System.out.println(input.charAt(i));
		
		}

	}
}
