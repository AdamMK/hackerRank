import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day9 {

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }


    public static void main(String[] args) throws IOException {
        System.out.println(factorial(5));
    }
}
