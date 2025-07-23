package com.string.programs;
import java.util.*;
import java.util.HashMap;
public class CountChara {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		HashMap<Character,Integer> charcount = new HashMap<>();
		for(char ch:input.toCharArray())
		{
			if(charcount.containsKey(ch))
			{
				charcount.put(ch, charcount.get(ch)+1);
			}
			else {
				charcount.put(ch, 1);
			}
		}
		for(char ch:charcount.keySet()) {
			System.out.println(ch + "-"+charcount.get(ch));
		}
	}
}
