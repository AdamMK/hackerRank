import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakingAnagramsTest {


    @Test
    void realAnagram(){
        String a = "adb";
        assertEquals(0, Result3.makeAnagram(a, "bda"));
    }

    @Test
    void offByOne(){
        String a = "adb";
        assertEquals(1, Result3.makeAnagram(a, "bdaf"));
    }

    @Test
    void offByOne2(){
        String a = "wadb";
        assertEquals(1, Result3.makeAnagram(a, "bda"));
    }

    @Test
    void offByMany(){
        String a = "aaacccdddfff";
        assertEquals(15, Result3.makeAnagram(a, "gggaaadddtolgsi"));
    }
}