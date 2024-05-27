package curs16.new_stuff;

public class ClaseInterneStaticeOuter {

    static class Inner {

        void doStuff() {
            System.out.println("Ana doing stuff");
        }

    }

}


class Test123 {
    public static void main(String[] args) {
        ClaseInterneStaticeOuter.Inner inner = new ClaseInterneStaticeOuter.Inner();
        inner.doStuff();
    }
}