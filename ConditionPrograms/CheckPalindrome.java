/*
WRite a program to check Palindrome or Not?
// */
 import java.util.*;
public class demo{
  public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    System.out.print(toceckPalindrome(s));
  }
  static String toceckPalindrome(String s){
    // Traveresal String from Right To Left
    int i=0, j=s.length()-1;
    while(i<j){
      // If Both Characters are equal
      if(s.charAt(i)==s.charAt(j))
      {
        i++;
        j--;
    }
        // Not Equal 
    else{
      return "Not palindrome";
    }
  }
  // Correct Palindrome
  return "Palindrome";
}
 }
