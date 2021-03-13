import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day29 {


//    public static int bitwise(int n, int k) {
//
//        List<Integer> nums = IntStream.rangeClosed(1, n)
//                .boxed()
//                .collect(Collectors.toList());
//
//        return nums.stream()
//                .flatMap(a -> nums.stream().flatMap(b -> (a < b) ? Stream.of(a & b) : Stream.empty()))
//                .mapToInt(Integer::intValue)
//                .filter(i -> i < k)
//                .max()
//                .getAsInt();
//    }

    public static int bitwise(int n, int k) {

        int max = Integer.MIN_VALUE;

        for(int a = 0; a < n; a++ ){
            for(int b = a+1; b<=n; b++ ){
                    int andInt = a&b;
                    if(andInt<k){
                        if(andInt > max) {
                            max = andInt;
                        }
                    }
            }
        }
        return max;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            System.out.println(bitwise(n,k));
        }

        scanner.close();
    }
}
