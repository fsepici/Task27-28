package ahmetC.task27.Ornek3;

public class Palov implements IFood {


    @Override
    public void taste() {
        System.out.println("Palov tadı bol baharatlı ve lezzetli ");
    }

    @Override
    public double ucret() {
        return 53.34;
    }


    void fry(){
        System.out.println("Palov kızartılıyor");
    }
    void boil(){
        System.out.println("Palov kaynatılıyor");
    }
}


