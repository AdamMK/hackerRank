import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class Day26Test {


    @Test
    void moreThanYearDelay() {
        LocalDate returnDate = LocalDate.of(2000,12,01);
        LocalDate dueDate = LocalDate.of(1999,12,01);

        assertEquals(10000, Day26.fine(returnDate, dueDate));
    }

    @Test
    void moreThanMonthDelay() {
        LocalDate returnDate = LocalDate.of(2000,12,01);
        LocalDate dueDate = LocalDate.of(2000,6,01);

        assertEquals(3000, Day26.fine(returnDate, dueDate));
    }

    @Test
    void moreThanDayDelay() {
        LocalDate returnDate = LocalDate.of(2000,12,20);
        LocalDate dueDate = LocalDate.of(2000,12,10);

        assertEquals(150, Day26.fine(returnDate, dueDate));
    }

    @Test
    void onDueDay() {
        LocalDate returnDate = LocalDate.of(2000,12,20);
        LocalDate dueDate = LocalDate.of(2000,12,20);

        assertEquals(0, Day26.fine(returnDate, dueDate));
    }

    @Test
    void beforeDueDay() {
        LocalDate returnDate = LocalDate.of(2000,12,10);
        LocalDate dueDate = LocalDate.of(2000,12,20);

        assertEquals(0, Day26.fine(returnDate, dueDate));
    }
}