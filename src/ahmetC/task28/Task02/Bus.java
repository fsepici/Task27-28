package ahmetC.task28.Task02;

public class Bus extends Vehicle implements IDiesel,IVehicle {


    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public void changeDiesel() {
        System.out.println("Bus change diesel");
    }

    @Override
    public String drive() {
        return "Bus is driving";
    }

    @Override
    public String toString() {
        return "Bus " + super.toString();
    }
}
