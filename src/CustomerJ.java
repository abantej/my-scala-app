public class CustomerJ {
    private final String fullname;

    public CustomerJ(String forename, String initial, String surname) {
        if (initial != null && !initial.isEmpty()) {
            this.fullname = String.format("%s %s. %s", forename, initial, surname);
        } else {
            this.fullname = String.format("%s %s", forename, surname);
        }
    }

    public CustomerJ(String forename, String surname) {
        this(forename, "", surname);
    }
}
