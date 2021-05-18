package Course;

import java.util.Scanner;

public class Day6 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void printWord() {

        char[] word = scanner.next().toCharArray();

        //even
        for(int i = 0; i < word.length; i+=2) {
            System.out.print(word[i]);
        }
        System.out.print(" ");

        //odd
        for(int i = 1; i < word.length; i+=2) {
                System.out.print(word[i]);
        }
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            printWord();
            System.out.println();
        }
        scanner.close();
    }
}
