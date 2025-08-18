 */
 Alternate case Swap
 Input : STRinG PrOGRam
 Output : strINg pRogrAM
 
import java.util.*;
public class Demo{
  public static void main(String args [])
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    System.out.print(NewString(s));
  }
  static String NewString(String s)
  {
    StringBuilder result = new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
      char ch = s.charAt(i);
      if(Character.isUpperCase(ch))
      {
        result.append(Character.toLowerCase(ch));
      }
      else{
        result.append(Character.toUpperCase(ch));
      }
  }
  return result.toString();
}
}
