import org.junit.Assert.*
import org.junit.Test

class TimeConversionKtTest{
    @Test
    fun timeConversion_correctOutput () {
        assertEquals("01:05:45", timeConversion("01:05:45AM"))
        assertEquals("07:05:45", timeConversion("07:05:45AM"))
        assertEquals("08:05:45", timeConversion("08:05:45AM"))
        assertEquals("09:05:45", timeConversion("09:05:45AM"))
        assertEquals("12:05:45", timeConversion("12:05:45PM"))
        assertEquals("13:05:45", timeConversion("01:05:45PM"))
        assertEquals("14:05:45", timeConversion("02:05:45PM"))
        assertEquals("23:05:45", timeConversion("11:05:45PM"))
        assertEquals("00:05:45", timeConversion("12:05:45AM"))
        assertEquals("00:00:00", timeConversion("12:00:00AM"))
        assertEquals("11:59:59", timeConversion("11:59:59AM"))
        assertEquals("23:59:59", timeConversion("11:59:59PM"))
    }
}