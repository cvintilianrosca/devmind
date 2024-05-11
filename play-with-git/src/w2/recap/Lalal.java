package w2.recap;

public interface Lalal {

    int test = 10;

    void doStuff2();

    void doStuff3();

    void doStuff4();


    static void doStaticStuff() {
        System.out.println("Doing static class");
    }

    private void lalaHelper() {
        System.out.println("Implements");
    }

    // pentru metode publice
    default void lala() {
        lalaHelper();
        System.out.println("Implements");
    }

}
