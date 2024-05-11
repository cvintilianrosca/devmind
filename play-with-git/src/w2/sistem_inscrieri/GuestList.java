package w2.sistem_inscrieri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GuestList implements GuestListActions {
    private final int locuriDisponibile;
    private ArrayList<Guest> participanti;
    private LinkedList<Guest> inAsteptare;

    public GuestList(int locuri) {
        locuriDisponibile = locuri;
        participanti = new ArrayList<>(locuri);
        inAsteptare = new LinkedList<>();
    }

    public int getLocuriDisponibile() {
        return locuriDisponibile;
    }


    public List<Guest> getParticipanti() {
        return participanti;
    }

//    public void setParticipanti(List<Guest> participanti) {
//        this.participanti = participanti;
//    }

    public List<Guest> getInAsteptare() {
        return inAsteptare;
    }

//    public void setInAsteptare(List<Guest> inAsteptare) {
//        this.inAsteptare = inAsteptare;
//    }

    @Override
    public int addGuest(Guest guest) {
        if (!searchGuest(guest)) {
            if (locuriDisponibile > participanti.size()) {
                participanti.add(guest);
                printConfirmParticipant(guest);
                return 0;
            } else {
                inAsteptare.addFirst(guest);
                printConfirmInAsteptare(guest);
                return inAsteptare.indexOf(guest);
            }
        }
        return -1;
    }

    @Override
    public boolean searchGuest(Guest guest) {
        return participanti.contains(guest) || inAsteptare.contains(guest);
    }

    @Override
    public boolean deleteGuest(Guest guest) {
        if (participanti.contains(guest)) {
            participanti.remove(guest);
            participanti.add(inAsteptare.getLast());
            printConfirmParticipant(guest);
            inAsteptare.removeLast();
            return true;
        }
        if (inAsteptare.contains(guest)) {
            inAsteptare.remove(guest);
            return true;
        }
        return false;
    }

    @Override
    public void updateGuestDetails(Guest guest) {
        if (participanti.contains(guest)) {
            Guest guestInParticipanti = participanti.get(participanti.indexOf(guest));
            updateGuestInList(guest, guestInParticipanti);
            return;
        }
        if (inAsteptare.contains(guest)) {
            Guest guestInAsteptare = inAsteptare.get(inAsteptare.indexOf(guest));
            updateGuestInList(guest, guestInAsteptare);
        }
    }

    private void updateGuestInList(Guest guest, Guest guestToUpdate) {
        guestToUpdate.setEmail(guest.getEmail());
        guestToUpdate.setFirstName(guest.getFirstName());
        guestToUpdate.setLastName(guest.getLastName());
        guestToUpdate.setPhoneNumber(guest.getPhoneNumber());
    }

    private void printConfirmParticipant(Guest guest) {
        System.out.format("%s %s Felicitari! Locul tau la eveniment este confirmat. Te asteptam!.\n", guest.getLastName(), guest.getFirstName());
    }

    private void printConfirmInAsteptare(Guest guest) {
        System.out.format("%s %s Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <%d>. Te vom notifica daca un loc devine disponibil.\n", guest.getLastName(), guest.getFirstName(), inAsteptare.indexOf(guest));
    }
}
