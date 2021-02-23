import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Array2D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        Optional<Integer> optionalMax = Optional.empty();
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                int sum = sumOfHourglass(arr, x, y);
                if (optionalMax.isPresent()) {
                    optionalMax = optionalMax.map((m) -> (sum > m) ? sum : m);
                } else {
                    optionalMax = Optional.of(sum);
                }
            }
        }
        return optionalMax.orElseThrow(() -> new IllegalArgumentException("Bad Grid supplied"));
    }

    static int sumOfHourglass(int[][] arr, int x, int y) {
        int t1 = arr[x][y];
        int t2 = arr[x][y + 1];
        int t3 = arr[x][y + 2];
        int m = arr[x + 1][y + 1];
        int b1 = arr[x + 2][y];
        int b2 = arr[x + 2][y + 1];
        int b3 = arr[x + 2][y + 2];
        int sum = t1 + t2 + t3 + m + b1 + b2 + b3;
        printHourGlass(t1, t2, t3, m, b1, b2, b3, sum);
        return sum;
    }

    private static void printHourGlass(int t1, int t2, int t3, int m, int b1, int b2, int b3, int sum) {
        System.out.format("%3d %3d %3d%n", t1, t2, t3);
        System.out.format("%7d%n", m);
        System.out.format("%3d %3d %3d total: %5d%n", b1, b2, b3, sum);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }


        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

