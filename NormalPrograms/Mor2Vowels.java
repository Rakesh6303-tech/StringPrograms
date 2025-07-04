import java.util.*;
// Given a string containing multiple words, identify and 
// print the words that have more than two vowels.
// Vowels are defined as the characters: 'a', 'e', 'i', 'o', 'u' 
// (both lowercase and uppercase). 
// If no words have more than two vowels, output -1
public class Demo{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    vowelscount(s);
  }
  // Methods Checks > 2 Vowels
  static void vowelscount(String s){
    Boolean value = false;
    // Avoid spaces (and other whitespace)
    String words [] = s.split("\\s+");
    for(String word:words){
      int counting = countvowels(word);
      if(counting>2){
        System.out.print(word);
        value = true;
      }
    }
    if(!value)
    {
      System.out.print("No > 2 Vowels Found in Given String");
    }
    
  }
  // CountVowels in the String
  static int countvowels(String s){
    int count=0;
    for(char ch:s.toCharArray())
    {
      // In the Vowel String chara checking vowels at index
      if("aeiouAEIOU".indexOf(ch)!=-1)
      {
        count++;
      }
    }
    return count;
  }
}
