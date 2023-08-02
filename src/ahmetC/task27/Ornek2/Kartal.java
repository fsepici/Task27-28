package AhmetC.task27.Ornek2;

import java.time.LocalDate;

public class Kartal extends Hayvan {


    public Kartal(String isim, int id, boolean vahsi, LocalDate dogumTarihi) {
        super(isim, id, vahsi, dogumTarihi);
    }

    @Override
    public void yiyecek() {
        System.out.println("Kartallar karadaki küçük hayvanları yer");
    }

    @Override
    void yemekMiktar() {
        System.out.println("Kartallar günlük 5 kilo et yer");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("Kartalların uyku süresi 5 saattir");
    }

    @Override
    void sesi() {
        System.out.println("Kartallar yüksek ve tiz sesler çıkarır");
    }
}
