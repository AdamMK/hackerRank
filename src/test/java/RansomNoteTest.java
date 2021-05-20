import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {


    @Test
    void correctWords(){
        List<String> magazine = Arrays.asList("aaa", "bbb", "eee", "rrr");
        assertEquals(true , Result2.checkMagazine(magazine, List.of("aaa", "bbb")));
    }

    @Test
    void notcorrectWordsss(){
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        assertEquals(false , Result2.checkMagazine(magazine, List.of("two", "times", "two", "is", "four")));
    }
}