package Transport;

import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private List<Mechanic> mechanics;

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", mechanics=" + mechanics +
                '}';
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public abstract void startMovement();
    public abstract void stopMovement();
    public abstract String getType();
    public abstract void printType();
    public abstract void passCarDiagnostics() throws TransportTypeException;
}
