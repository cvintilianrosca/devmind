package w2.recap;

public interface Doable1 extends Doable2 {

    static void blbla() {

    }

    default void do1() {
        System.out.println("Ana are pere");
    }
}
