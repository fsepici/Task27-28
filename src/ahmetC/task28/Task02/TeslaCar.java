package ahmetC.task28.Task02;

public class TeslaCar extends Vehicle implements IElectric,IVehicle {


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("Tesla changeBattery");
    }

    @Override
    public String drive() {
        return "TESLACAR is driving";
    }

    @Override
    public String toString() {
        return "TeslaCar " + super.toString();
    }
}
