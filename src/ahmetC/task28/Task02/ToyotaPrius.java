package AhmetC.task28.Task02;

public class ToyotaPrius extends Vehicle implements IElectric,IGas,IVehicle {


    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeBattery() {
        System.out.println("ToyotaPrius changeBattery");
    }

    @Override
    public void changeOil() {
        System.out.println("Toyota Prius changeOil");
    }

    @Override
    public String drive() {
        return "Toyota is driving";
    }

    @Override
    public String toString() {
        return "ToyotaPrius " + super.toString();
    }
}




