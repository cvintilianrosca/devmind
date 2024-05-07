package curs11.recap;

import java.util.HashMap;

public class HashMapRecap {
    public static void main(String[] args) {
        //      cheie    valoare
        HashMap<String, Integer> studentGradeByName = new HashMap<>();
        studentGradeByName.put("Gigel", 4);
        studentGradeByName.get("Gigel");

        Student s1 = new Student();
        Student s2 = new Student();

        s1.firstName = "Gigel";
        s2.firstName = "Gigel";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
