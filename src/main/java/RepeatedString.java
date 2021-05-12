import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long aInOneString = 0L;
        long aInSubsting = 0L;
        long numberFullStrings = n / s.length();
        int remainder = (int) (n % s.length());


        if (remainder > 0 ) {
            String cut = s.substring(0, remainder);
            for (char c : cut.toCharArray()) {
                if (c == 'a') aInSubsting++;
            }
        }

        for(char c:s.toCharArray()){
            if (c == 'a') aInOneString++;
        }
        return aInOneString*numberFullStrings+aInSubsting;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
