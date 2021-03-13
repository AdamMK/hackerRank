

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {


    @Test
    void first() {
        int steps = 8;
        String path = "UDDDUDUU";
        assertEquals(1,Result.countingValleys(steps,path));
    }

    @Test
    void second() {
        int steps = 10;
        String path = "UDUUUDUDDD";
        assertEquals(0,Result.countingValleys(steps,path));
    }
}