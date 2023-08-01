package ahmetC.task27.Ornek2;

import java.time.LocalDate;

public class Kedi extends Hayvan {


    public Kedi(String isim, int id, boolean vahsi, LocalDate dogumTarihi) {
        super(isim, id, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecek() {
        System.out.println("Kediler küçük hayvanlarla beslenir");
    }

    @Override
    void yemekMiktar() {
        System.out.println("yaklaşık olarak 3 kilo yerler");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println( "Günlük uyku süreleri 7 saattir");
    }

    @Override
    void sesi() {
        System.out.println("Kedilerin sesleri ince ve meoow şeklindedir");
    }
}
