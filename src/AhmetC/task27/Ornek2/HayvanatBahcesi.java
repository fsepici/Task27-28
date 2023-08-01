package AhmetC.task27.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kartal kartal1 = new Kartal("bjk", 23, true, LocalDate.of(2022, 5, 24));
        Kedi kedi1 = new Kedi("garfield", 345, false, LocalDate.of(2021, 3, 24));
        System.out.println("kartal1 = " + kartal1);
        kartal1.yiyecek();
        kartal1.sesi();
        kartal1.gunlukUykuSuresi();
        kartal1.yemekMiktar();
        kedi1.gunlukUykuSuresi();
        kedi1.yiyecek();
        kedi1.sesi();
        kedi1.gunlukUykuSuresi();
        kedi1.yiyecek();
        kedi1.yemekMiktar();
        System.out.println("kedi1 = " + kedi1);


    }
}
