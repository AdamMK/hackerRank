import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TimeConversionKtTest {

    @Test
    fun `PM returns over 12`(){
        val inputTime = "01:00:00PM"
        val expectedTime = "13:00:00"
        assertEquals(expectedTime, timeConversion(inputTime))
    }

    @Test
    fun `AM returns same`(){
        val inputTime = "01:00:00AM"
        val expectedTime = "01:00:00"
        assertEquals(expectedTime, timeConversion(inputTime))
    }

    @Test
    fun `12AM returns 00`(){
        val inputTime = "12:00:00AM"
        val expectedTime = "00:00:00"
        assertEquals(expectedTime, timeConversion(inputTime))
    }

    @Test
    fun `12AM  with minutes returns 00 with minutes`(){
        val inputTime = "12:20:00AM"
        val expectedTime = "00:20:00"
        assertEquals(expectedTime, timeConversion(inputTime))
    }

    @Test
    fun `12PM returns 12`(){
        val inputTime = "12:00:00PM"
        val expectedTime = "12:00:00"
        assertEquals(expectedTime, timeConversion(inputTime))
    }
}
