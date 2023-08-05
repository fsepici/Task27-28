package furkan.task27.Ornek2;

public class Kartal extends Hayvan {


    @Override
    public void yiyecegi() {
        System.out.println("av eti ");
    }

    @Override
    public void yemekMiktari() {
        System.out.println("avladığı kadar");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println("kartallar uyumaz");
    }

    @Override
    public void sesi() {
        System.out.println("beşiktaş");
    }
}
