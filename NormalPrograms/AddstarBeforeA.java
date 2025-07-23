package com.SubStrings;
import java.util.*;
public class AddstarBeforeA {
	  public static void main(String args [])
	  {
	    Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    AddStarBeforea(s);
	  }
	  static void AddStarBeforea(String s)
	  {
	    String t = "";
	    for(int i=0;i<s.length();i++)
	    {
	      char ch = s.charAt(i);
	      if(ch=='a' || ch=='A')
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
	


