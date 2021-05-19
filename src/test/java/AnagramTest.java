import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void notAnagram(){
        String example = "abc";
        assertEquals(-1, Result4.anagram(example));
    }

    @Test
    void obviousAnagram(){
        String example = "abba";
        assertEquals(0, Result4.anagram(example));
    }

    @Test
    void offByOne(){
        String example = "xaxbbbxx";
        assertEquals(1, Result4.anagram(example));
    }

    @Test
    void offByTwo(){
        String example = "mnop";
        assertEquals(2, Result4.anagram(example));
    }

}