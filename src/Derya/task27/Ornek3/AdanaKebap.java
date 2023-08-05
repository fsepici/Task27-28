package Derya.task27.Ornek3;

public class AdanaKebap implements IFood {
    public void marinade() {
        System.out.println("Siparis marine ediliyor");

    }

    public void grill() {
        System.out.println("siparis ızgarada");

    }

    @Override
    public void taste() {
        System.out.println("lezzet harika");

    }

    @Override
    public double ucret() {
        return 10.9;
    }
}






