package curs12.abstract_stuff.level1;

public interface AliveThingsActionsInterface {

    public final static String firstName = "Name";


    void respira();

    void mananca();

    void faceODeplasare();

    private void doPrivateStuff1() {

    }
    private void doPrivateStuff() {

    }

    default void doStuff() {
        doPrivateStuff();
        doPrivateStuff1();
    }

    static void doStaticStuff() {

    }
}


