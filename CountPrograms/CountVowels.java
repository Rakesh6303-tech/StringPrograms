package com.tap.interview;
import java.util.*;
public class Boats {
  // Count Instilaized
	static int count;
	public static void main(String args [])
	{
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		CountVowels(s);
		}
	static void CountVowels(String s) {
		// converted string to character
		for(char ch :s.toCharArray())
		{
      // checking conditon is vowel or not
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
					ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
        // count will be incremented if vowel
				count++;
			}
		}
		System.out.println(count);
	}
	}




