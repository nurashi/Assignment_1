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
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return grades.isEmpty() ? 0 : (double) total / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + "I am a student with ID[" + studentID + "]";
    }
}
