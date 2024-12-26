package org.example.tests;
import org.example.models.Teacher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TeacherTest {
    @Test
    public void testTeacher(){
        Teacher teach = new Teacher("Severus", "Snape", 51, "Male", "Math", 7, 800000);

        teach.giveRaise(10);
        assertEquals("Severus", teach.getName());
        assertEquals(51, teach.getAge());
    }
}
