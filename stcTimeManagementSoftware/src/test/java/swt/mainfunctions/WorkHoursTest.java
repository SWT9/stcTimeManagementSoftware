package swt.mainfunctions;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.springframework.ui.Model;

import swt.accessingdatamysql.HomeController;
import swt.accessingdatamysql.WorkHours;


@ContextHierarchy({
        @ContextConfiguration(classes = {WorkHours.class}),
        @ContextConfiguration(classes = {HomeController.class})
})

class WorkHoursTest {

    @Test
    void IdTest() {
        int random = (int) (Math.random() * 100 + 1);
        int id1 = 1;
        int negativeId = -1;
        WorkHours workHours1 = new WorkHours();
        workHours1.setId(id1);
        WorkHours workHours2 = new WorkHours();
        workHours2.setId(random);
        WorkHours workHours3 = new WorkHours();
        assertThrows(IllegalArgumentException.class, () -> workHours3.setId(negativeId));
        assertEquals(id1, workHours1.getId());
        assertEquals(random, workHours2.getId());
    }

    @Test
    void WorkTest() {
        WorkHours workHours = new WorkHours();
        workHours.setWorkDate("2022-11-22");
        workHours.setStartTime("08:00");
        workHours.setEndTime("16:00");
        workHours.setWorkTime(8);
        /*HomeController homeController = new HomeController();
         homeController.workHoursSubmit(workHours, model);*/
        assertEquals("2022-11-22", workHours.getWorkDate());
        assertEquals("08:00", workHours.getStartTime());
        assertEquals("16:00", workHours.getEndTime());
        assertEquals(8, workHours.getWorkTime());
    }

    @Test
    void UserIdTest() {
        int userId1 = 1;
        int userId2 = 2;
        WorkHours workHours1 = new WorkHours();
        WorkHours workHours2 = new WorkHours();
        workHours1.setUserId(userId1);
        workHours2.setUserId(userId2);
        assertEquals(1, workHours1.getUserId());
        assertEquals(2, workHours2.getUserId());
    }
}