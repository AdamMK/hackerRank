import java.util.*;

public class Day7 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length-1; i >= 0; i--){
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);


//       for(int i = 0; i < arr.length / 2; i++){
//           int temp = arr[i];
//           arr[i] = arr[arr.length - 1 - i];
//           arr[arr.length - 1 - i] = temp;
//       }
//
//        for( int i = 0; i < arr.length; i++) {
//            System.out.printf("%d ", arr[i]);
//        }

    }
}