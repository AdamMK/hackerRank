import java.io.*;
import java.util.*;

public class Day6 {

    public static void printWord(String w) {

        char[] wo = w.toCharArray();
        
        for(int i = 0; i < wo.length; i++) {
            if (i%2 == 0) {
                System.out.printf("%c", wo[i]);
            }
        }
        System.out.print(" ");
        for(int i = 0; i < wo.length; i++) {
            if (i%2 == 1) {
                System.out.printf("%c", wo[i]);
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            printWord(word);
        }


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}