package curs11.recap;

import curs11.comp_vs_inheritance.Gadget;

import java.util.Objects;

public class Student extends Object {
    String firstName;
    int age;
    String lastName;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return age == student.age && Objects.equals(firstName, student.firstName);
    }

    @Override
    public int hashCode() {
        char[] charArray = firstName.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return age + sum;
    }
}
