package curs11.dinamyc_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Om om = new Om();
        Om prof = new Profesor();
        Om stud = new Student();

        List<Om> om1 = List.of(om, prof, stud);

        printSuff(om1);

        Main main = new Main();

        main.doStuff(10);
        main.doStuff("dd");
        main.doStuff();


        ArrayList<Integer> arrayList = new ArrayList<>();



    }


    static void printSuff(List<Om> oameni) {
        for (Om omul : oameni) {
            omul.doStuff();
        }
    }






    void doStuff() {

    }

    void doStuff(int param) {

    }

    void doStuff(String param) {

    }

}
