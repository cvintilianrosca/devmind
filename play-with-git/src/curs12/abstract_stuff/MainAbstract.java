package curs12.abstract_stuff;

import curs12.abstract_stuff.level1.AliveThingsActionsInterface;
import curs12.abstract_stuff.level2.Animal;
import curs12.abstract_stuff.level2.Combinatie;
import curs12.abstract_stuff.level2.Planta;
import curs12.abstract_stuff.level3.Person;
import curs12.abstract_stuff.level3.Student;
import curs12.abstract_stuff.level3.Teacher;

import java.util.ArrayList;
import java.util.List;

public class MainAbstract {
    public static void main(String[] args) {

        AliveThingsActionsInterface.doStaticStuff();

        List<AliveThingsActionsInterface> list = new ArrayList<>();

        list.add(new Animal());
        list.add(new Person());
        list.add(new Student());
        list.add(new Teacher());
        list.add(new Planta());
        list.add(new Combinatie());
        goThroughTheList(list);



    }


    static void goThroughTheList(List<AliveThingsActionsInterface> list) {
        for (AliveThingsActionsInterface stuffThatAliveTHingsDoInterface : list) {
            stuffThatAliveTHingsDoInterface.respira();
            stuffThatAliveTHingsDoInterface.mananca();
            stuffThatAliveTHingsDoInterface.faceODeplasare();
            System.out.println();
        }
    }

}
