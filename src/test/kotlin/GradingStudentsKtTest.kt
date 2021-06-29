import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GradingStudentsKtTest {

    @Test
    fun `all grades smaller than 38`() {
        val input = arrayOf(22,0, 15, 37)
        val expected = arrayOf(22,0, 15, 37)
        assertTrue(expected.contentEquals(gradingStudents(input)))
    }

    @Test
    fun `grade to round up`() {
        val input = 69
        val expected = 70
        assertEquals(expected, eachGrade(input))
    }

    @Test
    fun `grade to round up 2`() {
        val input = 68
        val expected = 70
        assertEquals(expected, eachGrade(input))
    }

    @Test
    fun `grade no round up`() {
        val input = 67
        val expected = 67
        assertEquals(expected, eachGrade(input))
    }

    @Test
    fun `mixed grades`() {
        val input = arrayOf(70,0, 15, 48, 99)
        val expected = arrayOf(70,0, 15, 50,100)
        println(gradingStudents(input).toList())
        assertTrue(expected.contentEquals(gradingStudents(input)))
    }
}
