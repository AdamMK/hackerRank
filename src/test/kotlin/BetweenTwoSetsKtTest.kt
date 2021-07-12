import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BetweenTwoSetsKtTest {


    @Test
    fun `simpleTest`() {
        val arA = arrayOf(2,4)
        val arB = arrayOf(16,32, 96)

        assertEquals(3, getTotalX(arA,arB))
    }
}
