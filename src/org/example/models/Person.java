package org.example.models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender.equals("Male");
    }

    public Person() { }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + (gender ? "Male" : "Female");
    }
}
