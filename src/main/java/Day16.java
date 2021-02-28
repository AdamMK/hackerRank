import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        int x;
        try {
            x = Integer.parseInt(S);
            System.out.println(x);
        } catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}