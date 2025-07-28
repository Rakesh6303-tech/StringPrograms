Given a string, find the frequency of a specific character in it.
  Sample Inputs
  String : TAPACADEMY
   Character : A
  Output: 
         3
#Code 
import java.util.*;
public class Main {
  static int count;
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      char c = scan.next().charAt(0);
      CharacterFrequency(s,c);
  }
  static void CharacterFrequency(String s,char c)
  {
    for(char ch:s.toCharArray())
    {
      if(ch==c)
      {
        count++;
      }
    }
    System.out.print(count);
  }
}
