import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAnagramTest {

    @Test
    void NoAnagram() {
        String example = "abcd";
        assertEquals(0, Result22.sherlockAndAnagrams(example));
    }

    @Test
    void verySimpleTwoLetterAnagram() {
        String example = "aa";
        assertEquals(1, Result22.sherlockAndAnagrams(example));
    }

    @Test
    void verySimpleThreeLetterAnagram() {
        String example = "mom";
        assertEquals(2, Result22.sherlockAndAnagrams(example));
    }

    @Test
    void HRAnagram() {
        String example = "ifailuhkqq";
        assertEquals(3, Result22.sherlockAndAnagrams(example));
    }

    @Test
    void HRAnagram2() {
        String example = "kkkk";
        assertEquals(10, Result22.sherlockAndAnagrams(example));
    }
}