package exercises.technology;

public class SmartPhone extends AbstractEntity {
    private final int id;
    private final String brand;
    private final String model;
    private String cpu;
    private String os;

    public SmartPhone(String brand, String model, String cpu, String os) {
        super.setId();
        id = super.getId();
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.os = os;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public String getOs() {
        return os;
    }

    public void setCpu(String aCpu) {
        this.cpu = aCpu;
    }

    public void setOs(String aOs) {
        this.os = aOs;
    }
}
