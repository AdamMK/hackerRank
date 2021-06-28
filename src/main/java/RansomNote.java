import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Result2 {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static boolean checkMagazine(List<String> magazine, List<String> note) {
        HashMap<String, Integer> magMap = new HashMap<>();
        for (String word : magazine){
            magMap.compute(word, (k,v) -> (v == null) ? 1 : v+1);
        }

        for (String word : note){
            if(!magMap.containsKey(word) || magMap.get(word) == 0) {
                return false;
            }
            magMap.computeIfPresent(word,(k,v) -> v-1);
        }
        return true;
    }
}

public class RansomNote {
    public static void main(String[] args) {

//        String s1 = "sdasd";
//        String s2 = "ssd";
//        String flag = "NO";
//
//        for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()){
//            if(s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
//                flag = "YES";
//            }
//        }
//
//        System.out.println(flag);



        List<String> magazine = new ArrayList(Arrays.asList("aaa", "bb", "eee", "rrr"));
        List<String> note = new ArrayList(Arrays.asList("aaa", "bbb", "eee"));

        System.out.println(Result2.checkMagazine(magazine, note));

    }
}

