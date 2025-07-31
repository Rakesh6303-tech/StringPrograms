Reverse all the words in a given string while maintaining the order of the words.
Sample Input 1---> Tap academy
Sample Output 2---> paT ymedaca

import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            sb.append(word);
            sb.reverse();
            System.out.print(sb + " ");
        }

        scan.close();
    }
}
