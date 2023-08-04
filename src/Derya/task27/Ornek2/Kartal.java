package Derya.task27.Ornek2;


import java.time.LocalDate;

class Kartal extends Hayvan {
    public Kartal(int id, String isim, boolean vahsi, LocalDate dogumTarihi) {
        super(id, isim, vahsi, dogumTarihi);
        setYiyecegi("küçük kuşlar");
        setYemekMiktari(500);
        setGunlukUykuSuresi(6);
        setSesi("öter");
    }

    @Override
    public void yiyecegiNe() {
        System.out.println(getIsim() + " kartalı " + getYiyecegi() + " yer.");
    }

    @Override
    public void yemekMiktariNeKadar() {
        System.out.println(getIsim() + " kartalı günde " + getYemekMiktari() + " gram yer.");
    }

    @Override
    public void gunlukUykuSuresiNe() {
        System.out.println(getIsim() + " kartalı günde " + getGunlukUykuSuresi() + " saat uyur.");
    }

    @Override
    public void sesiNe() {
        System.out.println(getIsim() + " kartalı öter.");
    }
}