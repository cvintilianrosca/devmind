package curs12.abstract_stuff.level2;

import curs12.abstract_stuff.level1.AliveThingsActionsInterface;

public class Combinatie implements AliveThingsActionsInterface {

    @Override
    public void respira() {
        System.out.println("Combinatie");
    }

    @Override
    public void mananca() {
        System.out.println("Combinatie");

    }

    @Override
    public void faceODeplasare() {
        System.out.println("Combinatie");
    }
}
