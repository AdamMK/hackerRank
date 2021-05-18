package Course;

import java.util.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    int[] __elements;

    Difference(int[] elements){
        this.elements = elements;
    }

    int computeDifference(){

        maximumDifference = 1;

        for(int i=0; i < __elements.length-1; i++){
            for(int j = i+1; j <__elements.length; j++) {
                if(Math.abs(__elements[i]-__elements[j]) > maximumDifference)
                maximumDifference = Math.abs(__elements[i]-__elements[j]);
            }
        }
    return maximumDifference;
    }
}

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}