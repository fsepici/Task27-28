package AhmetC.task27.Ornek3;

public class Borsh implements IFood {

    @Override
    public void taste() {
        System.out.println("Borç çorbasının tadı yumuşak ve lezzetli");
    }

    @Override
    public double ucret() {
        return 55.45;
    }
    void boil(){
        System.out.println("Borş çorbası kaynatılıyor");
    }
}
