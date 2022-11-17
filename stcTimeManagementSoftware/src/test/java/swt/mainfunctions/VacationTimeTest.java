package swt.mainfunctions;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import swt.accessingdatamysql.VacationTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ContextConfiguration(classes = VacationTime.class)
class VacationTimeTest {

    @Test
    void IdTest() {
        int random = (int) (Math.random() * 100 + 1);
        int id1 = 1;
        int negativeId = -1;
        VacationTime vacationTime = new VacationTime();
        vacationTime.setId(id1);
        VacationTime vacationTime2 = new VacationTime();
        vacationTime2.setId(random);
        VacationTime vacationTime3 = new VacationTime();
        assertThrows(IllegalArgumentException.class, () -> vacationTime3.setId(negativeId));
        assertEquals(id1, vacationTime.getId());
        assertEquals(random, vacationTime2.getId());
    }

    @Test
    void StartPeriodTest() {
        VacationTime vacationTime = new VacationTime();
        vacationTime.setStartPeriod("2022-12-22");
        vacationTime.setEndPeriod("2023-01-09");
        assertEquals("2022-12-22", vacationTime.getStartPeriod());
        assertEquals("2023-01-09", vacationTime.getEndPeriod());
    }

    @Test
    void UserId() {
        int userId1 = 1;
        int userId2 = 2;
        VacationTime vacationTime1 = new VacationTime();
        VacationTime vacationTime2 = new VacationTime();
        vacationTime1.setUserId(userId1);
        vacationTime2.setUserId(userId2);
        assertEquals(1, vacationTime1.getUserId());
        assertEquals(2, vacationTime2.getUserId());
    }
}