package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> persons = new ArrayList<>();

    public void addMember(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person person : persons) {
            sb.append(person.toString()).append("\n");
        }
        return sb.toString();
    }
}
