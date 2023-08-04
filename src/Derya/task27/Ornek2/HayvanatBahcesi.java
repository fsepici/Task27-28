package Derya.task27.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {

        public static void main(String[] args) {

            Kedi kedi = new Kedi(1, "Uzay", false, LocalDate.of(2022, 10, 12));
            Kartal kartal = new Kartal(2, "Faster", true, LocalDate.of(2021, 8, 22));


            System.out.println("\nKedi Özellikleri:");
            System.out.println(kedi);
            kedi.yiyecegiNe();
            kedi.yemekMiktariNeKadar();
            kedi.gunlukUykuSuresiNe();
            kedi.sesiNe();

            System.out.println("\nKartal Özellikleri:");
            System.out.println(kartal);
            kartal.yiyecegiNe();
            kartal.yemekMiktariNeKadar();
            kartal.gunlukUykuSuresiNe();
            kartal.sesiNe();
        }
    }







