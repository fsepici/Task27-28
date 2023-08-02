package AhmetC.task28.Task02;

public abstract class Vehicle {
        private String model;
        private double engine;

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Vehicle(String model, double engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
}
