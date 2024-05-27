package curs16.new_stuff;

public class ClaseLocale {

    public ClaseLocale() {
        System.out.println("dupa constructor");
    }

    // small brain moment
    private static final String value;

    static {
        value = "ceva";
        System.out.println("Al treilea");
    }

    static {
        System.out.println("Primul");
    }

    static {
        System.out.println("Al doilea");
    }

    {
        System.out.println("Inainte de constructoor");
    }

    {
        System.out.println("Inainte de constructoor");
    }

    {
        class MyRandomClassToComplicateMyLife {

        }
        System.out.println("Inainte de constructoor");
    }



    static SaFieAici doStuff() {

        class MyClassInMethod implements SaFieAici{

            @Override
            public void safacaCeva() {

            }
        }

        MyClassInMethod myClassInMethod = new MyClassInMethod();

        System.out.println(myClassInMethod);


        if(true) {

            class MyClassInBLock {
                void doStuff() {
                    System.out.println("ANa are mere");
                }
            }

            MyClassInBLock myClassInBLock = new MyClassInBLock();


        }

        return myClassInMethod;

    }


    public static void main(String[] args) {
        ClaseLocale claseLocale = new ClaseLocale();
        doStuff();
    }
}

interface SaFieAici {
    void safacaCeva();
}
