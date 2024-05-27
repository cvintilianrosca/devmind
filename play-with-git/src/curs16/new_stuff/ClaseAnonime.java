package curs16.new_stuff;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class ClasaMeaIubita implements Actions {

    @Override
    public void doStuff() {

    }

}

interface Actions {
    void doStuff();

}

public class ClaseAnonime {

    public static void main(String[] args) {

        Actions actions = new Actions() {

            @Override
            public void doStuff() {
                System.out.println("Stuff");
            }

        };

//        actions.doStuff();;


        List<Student> list = new LinkedList<>();

        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        list.add(new Student());
        

        list.sort((o1, o2) -> -1);


    }
}


class ClasaMeaCuComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}


class Student {
    String firstName;
    String lastName;
}