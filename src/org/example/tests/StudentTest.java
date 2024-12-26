package org.example.tests;
import org.example.models.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StudentTest {
    @Test
    public void testCalculateGPA() {
        Student student = new Student("Harry", "Potter", 21, "Male");

        student.addGrade(30);
        student.addGrade(30);
        student.addGrade(30);

        double expectGPA = 30;
        assertEquals(expectGPA, student.calculateGPA(), 0.1, "Somethins is wrong");
    }
}
