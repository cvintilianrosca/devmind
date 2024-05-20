package curs15.clase_interne;

import java.util.Comparator;

public class OuterClass {

    public OuterClass() {
        doStuff();
    }

    private String name;
    private String justAnotherField;
    private int value;

    public void doStuff() {
        System.out.println("Ana are pere si probleme");
    }

    void justSomeOtherMethod() {


    }

    public InnerClass doInnerStuff() {
        InnerClass in = new InnerClass();
        return in;
    }

      class InnerClass extends Whatever {

        private static String stuff;

        public InnerClass() {
            name = "lala";
        }

        @Override
        public void doStuff() {
            System.out.println("Whaterver");
        }
    }

}

class AltaClasa extends OuterClass {

    public AltaClasa() {
//        super();
    }

}

class Whatever {
    void doStuff() {

        {
            class Inbloc {

            }
        }

        if (true) {

            Comparator<Object> comparator = new Comparator<>() {

                @Override
                public int compare(Object o1, Object o2) {
                    return 0;
                }
            };

            class InIf{

            }

        }

        class InMetoda {

        }

    }
}

class Main {
    public static void main(String[] args) {
        AltaClasa altaClasa = new AltaClasa();
        OuterClass.InnerClass outerClass = new OuterClass().new InnerClass();

//        Whatever innerClass1 = outerClass.doInnerStuff();
//        innerClass1.doStuff();
    }
}