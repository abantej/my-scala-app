// static vs companion objects
public class EmployeeJ {

    private static Integer sequenceOfIds;

    private final String name;
    private final String address;

    private Integer id;

    public EmployeeJ(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = EmployeeJ.nextId();
    }

    private static Integer nextId() {
        return sequenceOfIds++;
    }
}
