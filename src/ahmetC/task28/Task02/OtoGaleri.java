package ahmetC.task28.Task02;


import java.util.ArrayList;
import java.util.List;

public class OtoGaleri {
    static List<Vehicle> vehicleList=new ArrayList<>();
    public static void main(String[] args) {
        Vehicle tesla=new TeslaCar("2021",3.4);
        Vehicle toyota=new ToyotaPrius("2022",3.5);
        Vehicle bus=new Bus("2019",2.8);
        vehicleList.add(tesla);
        vehicleList.add(toyota);
        vehicleList.add(bus);
        System.out.println("vehicleList.toString() = " + vehicleList.toString());

    }

}
