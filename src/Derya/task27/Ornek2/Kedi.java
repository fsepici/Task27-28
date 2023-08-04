package Derya.task27.Ornek2;


import java.time.LocalDate;


    class Kedi extends Hayvan {
        public Kedi(int id, String isim, boolean vahsi, LocalDate dogumTarihi) {
            super(id, isim, vahsi, dogumTarihi);
            setYiyecegi("balık");
            setYemekMiktari(200);
            setGunlukUykuSuresi(16);
            setSesi("miyav");

        }


        @Override
        public void yiyecegiNe() {
            System.out.println(getIsim() + " kedisi " + getYiyecegi() + " yer.");
        }

        @Override
        public void yemekMiktariNeKadar() {
            System.out.println(getIsim() + " kedisi günde " + getYemekMiktari() + " gram yer.");
        }

        @Override
        public void gunlukUykuSuresiNe() {
            System.out.println(getIsim() + " kedisi günde " + getGunlukUykuSuresi() + " saat uyur.");
        }

        @Override
        public void sesiNe() {
            System.out.println(getIsim() + " kedisi miyavlar.");
        }
    }




