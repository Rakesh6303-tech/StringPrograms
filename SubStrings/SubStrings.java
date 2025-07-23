package com.string.programs;
import java.util.*;
public class Substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int size = scan.nextInt();
		printSubStrings(input,size);
	}
	static void printSubStrings(String input,int size)
	{
		for(int i=0;i<=input.length()-size;i++)
		{
			String t = "";
			for(int j=i;j<size+i;j++)
			{
				t = t+input.charAt(j);
			}
			System.out.println(t);
		}
	}

}
