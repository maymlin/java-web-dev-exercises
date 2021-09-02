package exercises.technology;

public abstract class AbstractEntity {
    private static int Id = 1;
    protected String brand;
    protected String model;
    protected String cpu;
    protected String os;

    public int getId() {
        return Id;
    };

    public void setId() {
        Id += 1;
    }
}
