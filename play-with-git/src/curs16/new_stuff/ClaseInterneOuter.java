package curs16.new_stuff;

public class ClaseInterneOuter {
    private String field;

    private void doStuff() {

    }

    private void doOuterStuff() {
        System.out.println("ANa are mere");
    }


    class Inner {

        private String field;

        private void doStuff() {
            doOuterStuff();
            this.field = "lala";
            ClaseInterneOuter.this.field = "lala";
        }
    }

}


class Test {
    public static void main(String[] args) {
        ClaseInterneOuter claseInterneOuter = new ClaseInterneOuter();
        ClaseInterneOuter.Inner inner = claseInterneOuter.new Inner();
        ClaseInterneOuter.Inner inner1 = new ClaseInterneOuter().new Inner();
    }
}