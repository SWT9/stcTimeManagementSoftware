package swt;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import swt.accessingdatamysql.SicknessTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = SicknessTime.class)
class SicknessTimeTest {

    @Test
    void IdTest() {
        int random = (int) (Math.random() * 100 + 1);
        int id1 = 1;
        SicknessTime sicknessTime = new SicknessTime();
        sicknessTime.setId(id1);
        SicknessTime sicknessTime2 = new SicknessTime();
        sicknessTime2.setId(random);
        assertEquals(id1, sicknessTime.getId());
        assertEquals(random, sicknessTime2.getId());
    }

    @Test
    void SicknessDayTest() {
        String sicknessDay1 = "2022-03-01";
        String sicknessDay2 = "2025-12-23";
        SicknessTime sicknessTime1 = new SicknessTime();
        SicknessTime sicknessTime2 = new SicknessTime();
        sicknessTime1.setSicknessDay(sicknessDay1);
        sicknessTime2.setSicknessDay(sicknessDay2);
        assertEquals("2022-03-01", sicknessTime1.getSicknessDay());
        assertEquals("2025-12-23", sicknessTime2.getSicknessDay());
    }

    @Test
    void TotalSicknessDaysTest() {
        int totalSicknessDays1 = 15;
        int totalSicknessDays2 = 0;
        SicknessTime sicknessTime1 = new SicknessTime();
        SicknessTime sicknessTime2 = new SicknessTime();
        sicknessTime1.setTotalSicknessDays(totalSicknessDays1);
        sicknessTime2.setTotalSicknessDays(totalSicknessDays2);
        assertEquals(15, sicknessTime1.getTotalSicknessDays());
        assertEquals(0, sicknessTime2.getTotalSicknessDays());
    }

    @Test
    void UserIdTest() {
        int userId1 = 1;
        int userId2 = 2;
        SicknessTime sicknessTime1 = new SicknessTime();
        SicknessTime sicknessTime2 = new SicknessTime();
        sicknessTime1.setUserId(userId1);
        sicknessTime2.setUserId(userId2);
        assertEquals(1, sicknessTime1.getUserId());
        assertEquals(2, sicknessTime2.getUserId());
    }

}
