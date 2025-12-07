Input : ron
  output : r
           o
           n
           r o
           o n
           r o n
  
import java.util.*;
public class Main {
    public static void main(String[] args) {
      //System.out.println("Hello, World!");
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      PrintAllSubStrings(s);
    }
    static void PrintAllSubStrings(String s)
    {
      for(int size=1;size<=s.length();size++){
        
      for(int i=0;i<=s.length()-size;i++)
        {
          String t = "";
          for(int j=i;j<i+size;j++)
          {
            t = t+ s.charAt(j);
          }
        System.out.println(t);
      }
      } 
    }

    
  }
