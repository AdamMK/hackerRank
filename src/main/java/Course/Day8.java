package Course;//Complete this code or write your own from scratch

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Day8{
    public static void main(String []args){
        Map<String,Integer> phoneDict = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneDict.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneDict.containsKey(s)) {
                System.out.println(s+"="+phoneDict.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}