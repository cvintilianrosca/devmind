package w2.sistem_inscrieri;

public interface GuestListActions {
    int addGuest(Guest guest);
    boolean searchGuest(Guest guest);
    boolean deleteGuest(Guest guest);
    void updateGuestDetails(Guest guest);


}
