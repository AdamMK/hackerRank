import java.io.*;

class Result3 {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int[] alphabet = new int[26];
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            int index = currentChar - 'a';
            alphabet[index]++;
        }

        for (int i = 0; i < b.length(); i++) {
            char currentChar = b.charAt(i);
            int index = currentChar - 'a';
            alphabet[index]--;
        }

        for (int el : alphabet) {
            sum += Math.abs(el);
        }

        return sum;
    }
}

public class MakingAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result3.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
