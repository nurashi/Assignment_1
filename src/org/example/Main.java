package org.example;

import org.example.models.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        File studentFile = new File("src/student.txt");
        Scanner scanner = new Scanner(studentFile);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();

            if (line.isEmpty()){
                continue;
            }

            String[] parts = line.split(" ");

            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            String gender = parts[3];

            Student student = new Student(name, surname, age, gender);

            for (int i = 4; i < parts.length; i++) {
                student.addGrade(Integer.parseInt(parts[i]));
            }

            school.addMember(student);
        }
        scanner.close();

        File teacherFile = new File("src/teacher.txt");
        Scanner scanner1 = new Scanner(teacherFile);

        while (scanner1.hasNextLine()) {
            String line = scanner1.nextLine().trim();

            if (line.isEmpty()) continue;

            String[] parts = line.split(" ");

            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            String gender = parts[3];
            String subject = parts[4];
            int yearsOfExperience = Integer.parseInt(parts[5]);
            int salary = Integer.parseInt(parts[6]);

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);

            if (yearsOfExperience > 10) {
                teacher.giveRaise(10);
            }

            school.addMember(teacher);
        }
        scanner1.close();

        System.out.println(school);
    }
}
