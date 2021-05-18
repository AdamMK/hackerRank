package Course;

import Course.Day25;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Day25Test {


    private List<Integer> primes = List.of(19, 31, 43, 1000000007, 1000003, 47, 61, 67, 71, 79, 101, 137, 139, 149, 193, 223, 241, 251, 263, 277, 307, 311, 349, 353, 359, 373, 379, 419, 433, 461, 463, 491, 509, 541, 563, 571, 577, 587);
    @TestFactory
    Stream<DynamicTest> theseArePrimes() {
        return primes.stream().map(number ->
                DynamicTest.dynamicTest("no: " + number, () -> {
                    assertTrue(Day25.isPrime(number));
                })
        );
    }

    private List<Integer> notPrimes = List.of(1, 4, 60, 80, 100000003);
    @TestFactory
    Stream<DynamicTest> theseAreNotPrimes() {
        return notPrimes.stream().map(number ->
                DynamicTest.dynamicTest("no: " + number, () -> {
                    assertFalse(Day25.isPrime(number));
                })
        );
    }

//    @Test
//    void spike() {
//        for (int i = 2; i <= 100000003; i++) {
//            if (100000003 % i == 0) {
//                System.out.println(i);
//            }
//        }
//    }
}
