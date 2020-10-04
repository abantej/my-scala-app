public class CustomerJ {
    private final String name;
    private final String address;

    private String id;

    public CustomerJ(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static void main(String... args) {
        CustomerJ eric = new CustomerJ("Eric", "29 Acacia Road");
    }
}
