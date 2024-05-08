package curs12.recap;

public class OmChinuit extends Student {

    public OmChinuit(String name) {
        super(name);

    }

    @Override
    void doStuff() {
        System.out.println("LALA");
        super.doStuff();
    }
}
