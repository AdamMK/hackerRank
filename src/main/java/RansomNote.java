import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result2 {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
        for(int i = 0; i < note.size();i++){
            if (magazine.contains(note.get(i))) {
                magazine.remove(note.get(i));
                note.remove(i);
                i = -1;
            }
        }
        // System.out.println(magazine);
        // System.out.println(note);
        if (note.size() == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

public class RansomNote {
    public static void main(String[] args) throws IOException {

        List<String> magazine = new ArrayList(Arrays.asList("aaa", "bb", "eee", "rrr"));
        List<String> note = new ArrayList(Arrays.asList("aaa", "bbb", "eee"));

        Result2.checkMagazine(magazine, note);

    }
}

