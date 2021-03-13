import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day29Test {


        //5 2 - 1
        //8 5 - 4
        //2 2 - 0

    @Test
    void firstExample(){
        int n = 5;
        int k = 2;
        assertEquals(1,Day29.bitwise(n,k));
    }

    @Test
    void secondExample(){
        int n = 8;
        int k = 5;
        assertEquals(4,Day29.bitwise(n,k));
    }

    @Test
    void thirdExample(){
        int n = 2;
        int k = 2;
        assertEquals(0,Day29.bitwise(n,k));
    }
}