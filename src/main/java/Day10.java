import java.util.Arrays;
import java.util.Scanner;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");



        scanner.close();

        int sum = 0;

        //to binary
        String binStr = Integer.toString(n, 2);

        //split all the ones by getting rid of 0
        String[] ones = binStr.split("0");


        //System.out.println(Arrays.toString(strparts));

        //check which collection of ones is the longest
        for(int i = 0; i<ones.length; i++) {
            if (sum < ones[i].length()) {
                sum = ones[i].length();
            }

        }
        System.out.println(sum);
    }
}
