import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringTest {

    @Test
    void check(){
        String s = "abcac";
        Long n = 10L;
        assertEquals(4, RepeatedString.repeatedString(s,n));
    }

    @Test
    void check2(){
        String s = "a";
        Long n = 1000000000000L;
        assertEquals(1000000000000L, RepeatedString.repeatedString(s,n));
    }

    @Test
    void check3(){
        String s = "aba";
        Long n = 10L;
        assertEquals(7L, RepeatedString.repeatedString(s,n));
    }

    @Test
    void bigOne(){
        String s = "kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm";
        Long n = 736778906400L;
        assertEquals(51574523448L, RepeatedString.repeatedString(s,n));
    }

    @Test
    void bigOne2(){
        String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
        Long n = 549382313570L;
        assertEquals(16481469408L, RepeatedString.repeatedString(s,n));
    }
}