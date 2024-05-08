package curs11.dinamyc_polymorphism;

import java.util.*;
import java.util.stream.Collectors;


interface Whatever2 {

    public static final String firstName = "lala";

    void doSunet();
    void primesteSunet();

//    private doStuff() {
//
//    }
}

public abstract class Main {

    String firstName;

     abstract void doSunet();
     abstract void primesteSunet();


     void algorithm() {
         doSunet();
         System.out.println("WHatever");
         primesteSunet();
     }

    public static void main(String[] args) {
        Om om = new Om();
        Om prof = new Profesor();
        Om stud = new Student();

        List<Om> om1 = List.of(om, prof, stud);

        ArrayList<Om> ne = new ArrayList<>();

        for (Om omulet : om1 ) {
            if ("Om".equals(omulet.firstName)) {
                ne.add(omulet);
            }
        }

        List<Om> collect = ne.stream()
                .filter(om3 -> "Om".equals(om3.firstName))
                .filter(om3 -> "Om".equals(om3.firstName))
                .filter(om3 -> "Om".equals(om3.firstName))
                .collect(Collectors.toList());


        List<Object> objects = new ArrayList<>();

        Main main = new Whatever();
        main.algorithm();



        ArrayList<Integer> arrayList = new ArrayList<>();



    }


    static void printSuff(List<Om> oameni) {
        for (Om omul : oameni) {
            omul.doStuff();
        }
    }






//    void doStuff() {
//        StringBuilder s3 = new StringBuilder();
//        String s = "Ana are mere";
//        s3.equals(s);
//        s.equals(s3);
//        s.intern();
//    }

    void doStuff(int param) {

    }

    void doStuff(String param) {

    }

}

class Whatever extends Main {


    @Override
    void doSunet() {
        System.out.println("Bla bla bla ");
    }

    @Override
    void primesteSunet() {
        System.out.println("Aaaa, bla bla bla");
    }
}