import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class ApplesAndOrangesKtTest {

    @Test
    fun `oneGoodApple`() {
        val expected = Pair(1,0)
        assertEquals(expected, countApplesAndOranges(5,10,0,15,arrayOf(5), arrayOf()))
    }

    @Test
    fun `multipleApples`() {
        val expected = Pair(3,0)
        assertEquals(expected, countApplesAndOranges(5,10,0,15,arrayOf(5,0,-3,8,10), arrayOf()))
    }

    @Test
    fun `oneGoodOrange`() {
        val expected = Pair(0,1)
        assertEquals(expected, countApplesAndOranges(5,10,0,15,arrayOf(), arrayOf(-6)))
    }

    @Test
    fun `multipleOranges`() {
        val expected = Pair(0,2)
        assertEquals(expected, countApplesAndOranges(5,10,0,15,arrayOf(), arrayOf(-1,-5,-8,-11,5,1)))
    }


    @Test
    fun `wholeSolution`() {
        val expected = Pair(1,1)
        assertEquals(expected, countApplesAndOranges(7,11,5,15,arrayOf(-2,2,1), arrayOf(5,-6)))
    }

}
