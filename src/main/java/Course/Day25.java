package Course;

import java.util.Scanner;

public class Day25 {

    public static boolean isPrime(int n) {
        int sqn = (int) Math.sqrt(n);
        if (n == 2) {
            return true;
        } else if (n == 1 || n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            for (int i = 3; i <= sqn; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void isPrimeToString(int number){
        if (!isPrime(number)) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int e = 0; e < arr.length; e++) {
            isPrimeToString(arr[e]);
        }
    }

}