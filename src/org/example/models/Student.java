package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int idCounter = 1;
    private final int studentID;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, String gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }



    public double calculateGPA() {
        double average = grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        // it's just a way of grading
        if (average > 95) {
            return 4.0;
        } else if (average > 89) {
            return 3.7;
        } else if (average > 79) {
            return 3.33;
        } else if (average > 69) {
            return 2.9;
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID[" + studentID + "] with grade - " + calculateGPA();
    }
}
