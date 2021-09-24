//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ArraysLeftRotationTest {
//
//
//    @Test
//    void anArrayWithoutAnyRotation() {
//        List<Integer> inputArray = List.of(0,1,2,3,4,5);
//        assertEquals(List.of(0,1,2,3,4,5), Result1.rotLeft(inputArray, 0));
//    }
//
//    @Test
//    void anArrayRotatesOnce() {
//        List<Integer> inputArray = List.of(1,2,3,4,5);
//        assertEquals(List.of(2,3,4,5,1), Result1.rotLeft(inputArray, 1));
//    }
//
//    @Test
//    void anArrayRotatesTwice() {
//        List<Integer> inputArray = List.of(1,2,3,4,5);
//        assertEquals(List.of(3,4,5,1,2), Result1.rotLeft(inputArray, 2));
//    }
//
//    @Test
//    void anArrayRotatesFourTimes() {
//        List<Integer> inputArray = List.of(1,2,3,4,5);
//        assertEquals(List.of(5,1,2,3,4), Result1.rotLeft(inputArray, 4));
//    }
//
//    @Test
//    void anArrayRotatesThree() {
//        List<Integer> inputArray = List.of(3,8,9,7,6);
//        assertEquals(List.of(9,7,6,3,8), Result1.rotLeft(inputArray, 3));
//    }
//}