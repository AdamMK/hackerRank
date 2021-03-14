import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpingOnCloudsTest {

    @Test
    void noTrippleCumulus(){
        int[] gameBoard = {0,0,1,0,0,1,0};
        assertEquals(4,JumpingOnClouds.jumpingOnClouds(gameBoard));
    }

    @Test
    void trippleCumulus(){
        int[] gameBoard = {0,1,0,0,0,1,0};
        assertEquals(3,JumpingOnClouds.jumpingOnClouds(gameBoard));
    }

    @Test
    void hackTest(){
        int[] gameBoard = {0,0,0,1,0,0};
        assertEquals(3,JumpingOnClouds.jumpingOnClouds(gameBoard));
    }

    @Test
    void quadrupleColumbus(){
        int[] gameBoard = {0,0,1,0,0,0,0,1,0,0};
        assertEquals(6,JumpingOnClouds.jumpingOnClouds(gameBoard));
    }

    @Test
    void multipleColumbus(){
        int[] gameBoard = {0,0,1,0,0,0,0,0,1,0,0};
        assertEquals(6,JumpingOnClouds.jumpingOnClouds(gameBoard));
    }

    @Test
    void manyColumbus(){
        int[] gameBoard = {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0};
        assertEquals(28,JumpingOnClouds.jumpingOnClouds(gameBoard));
    }


}