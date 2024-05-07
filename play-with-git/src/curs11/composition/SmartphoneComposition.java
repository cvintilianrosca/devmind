package curs11.composition;

public class SmartphoneComposition {
    Screen screen;
    Battery battery;
    Speaker speaker;

    // stoika
    // perestroika

    public SmartphoneComposition(Screen screen, Battery battery, Speaker speaker) {
        this.screen = screen;
        this.battery = battery;
        this.speaker = speaker;
    }

    public SmartphoneComposition() {
        this.screen = new Screen();
        this.battery = new Battery();
        this.speaker = new Speaker();
    }
}


class Screen {
    String screen;
}

class Battery {
    String battery;

    LithiumIon lithiumIon;

}


class Speaker {
    String speaker;
}


class LithiumIon {
    ChemistryStuffThatIDontKnowAnymore_Ceva_cu_atomi chemistryStuffThatIDontKnowAnymoreCevaCuAtomi;
}

class ChemistryStuffThatIDontKnowAnymore_Ceva_cu_atomi {

}
