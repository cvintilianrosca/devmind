package curs12.abstract_stuff.level2;

import curs12.abstract_stuff.level1.AliveThingsActionsInterface;
import curs12.abstract_stuff.level1.ThingsThatExist;

public class Animal implements AliveThingsActionsInterface, ThingsThatExist {

    public void faceSunete() {

    }

    @Override
    public void respira() {

        System.out.println("A");
    }

    @Override
    public void mananca() {
        System.out.println("c");

    }

    @Override
    public void faceODeplasare() {
        System.out.println("c");

    }

    @Override
    public void doExist() {

    }
}
