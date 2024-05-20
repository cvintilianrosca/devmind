package curs13.recap;

public abstract class Recap extends RecapTest {
    abstract void doStuff();
}


class RecapTest {

}


class Test {
    public static void main(String[] args) {
//        RecapTest recap = new Recap();
        Surpriza.generate();
//        new Surpriza();
    }
}


// Singleton design pattern
// Spring

class Surpriza {

    private static Surpriza singleInstance;

    public static Surpriza generate() {
        if (singleInstance == null) {
            singleInstance = new Surpriza();
        }
        return singleInstance;
    }

    private Surpriza() {

    }

}
