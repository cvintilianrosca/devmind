package w2.recap.interface_rec;


import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        TreeSet<Integer> set = new TreeSet<>();

        doStuffWithCollections(set);

    }

    static void doStuffWithCollections(Collection<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    static void performActionsWithOameni(Om om) {
        om.doOmStuff();
    }
}

interface Om {
    void doOmStuff();
}


class Student implements Om {
    @Override
    public void doOmStuff() {
        System.out.println("Student stuff");
    }
}

class Teacher implements Om {
    @Override
    public void doOmStuff() {
        System.out.println("Boring");
    }
}


class Paznic implements Om {
    @Override
    public void doOmStuff() {
        System.out.println("Dorm");
    }
}

class Inginer implements Om {
    @Override
    public void doOmStuff() {
        System.out.println("Somer in viitor");
    }
}


class Somer extends Inginer {
    @Override
    public void doOmStuff() {
        super.doOmStuff();
    }
}

