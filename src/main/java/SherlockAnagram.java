import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Result22 {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {

        int pairsCount = 0;

        List<String> allPos = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (!s.substring(i, j).equals(s)) {
                    allPos.add(s.substring(i, j));
                }
            }
        }

        for (int i = 0; i < allPos.size()-1; i++){
            for (int j = i+1; j < allPos.size(); j++) {
                char[] first = allPos.get(i).toCharArray();
                char[] second = allPos.get(j).toCharArray();
                Arrays.sort(first);
                Arrays.sort(second);
                if (Arrays.equals(first,second)) {
                    pairsCount++;
                }
            }
        }

        return pairsCount;
    }

}

public class SherlockAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result22.sherlockAndAnagrams(s);

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
