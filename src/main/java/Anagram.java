import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result4 {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {

        if (s.toCharArray().length%2 != 0) return -1;

        String firstHalf = s.substring(0,s.length()/2);
        String secondHalf = s.substring(s.length()/2);
        int[] alphabet = new int[26];

        for (int i = 0; i < firstHalf.length(); i++) {
            int letter = firstHalf.charAt(i);
            int index = letter - 'a';
            alphabet[index]++;
        }

        for (int i = 0; i < secondHalf.length(); i++) {
            int letter = secondHalf.charAt(i);
            int index = letter - 'a';
            alphabet[index]--;
        }

        int sum = 0;

        for(int x : alphabet) {
            sum += Math.abs(x);
        }

    return sum/2;
    }

}

public class Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result4.anagram(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
