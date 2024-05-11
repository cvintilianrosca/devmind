package w2.sistem_inscrieri;

import java.util.List;

public class GuestList {
    private int locuriDisponibile;
    private List<Guest> participanti;
    private List<Guest> inAsteptare;

    public int getLocuriDisponibile() {
        return locuriDisponibile;
    }

    public void setLocuriDisponibile(int locuriDisponibile) {
        this.locuriDisponibile = locuriDisponibile;
    }

    public List<Guest> getParticipanti() {
        return participanti;
    }

    public void setParticipanti(List<Guest> participanti) {
        this.participanti = participanti;
    }

    public List<Guest> getInAsteptare() {
        return inAsteptare;
    }

    public void setInAsteptare(List<Guest> inAsteptare) {
        this.inAsteptare = inAsteptare;
    }
}
