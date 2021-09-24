import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FibKtTest {

    @Test
    fun `0 is zero`() {
        val input = 0
        val expectedOutcome = 0
        assertEquals(expectedOutcome, fibIter(input) )
    }

    @Test
    fun `other numbers`() {
        val input = 10
        val expectedOutcome = 55
        assertEquals(expectedOutcome, fibIter(input) )
    }

}