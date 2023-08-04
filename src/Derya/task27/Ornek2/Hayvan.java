package Derya.task27.Ornek2;


import java.time.LocalDate;

    public abstract class Hayvan {
    private int id;
    private String isim;
    private boolean vahsi;
    private LocalDate dogumTarihi;
    private String yiyecegi;
    private int yemekMiktari;
    private int gunlukUykuSuresi;
    private String sesi;

        public Hayvan(int id, String isim, boolean vahsi, LocalDate dogumTarihi) {
            this.id = id;
            this.isim = isim;
            this.vahsi = vahsi;
            this.dogumTarihi = dogumTarihi;
        }
        public abstract void yiyecegiNe();

        public abstract void yemekMiktariNeKadar();

        public abstract void gunlukUykuSuresiNe();

        public abstract void sesiNe();

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public boolean isVahsi() {
            return vahsi;
        }

        public void setVahsi(boolean vahsi) {
            this.vahsi = vahsi;
        }

        public LocalDate getDogumTarihi() {
            return dogumTarihi;
        }

        public void setDogumTarihi(LocalDate dogumTarihi) {
            this.dogumTarihi = dogumTarihi;
        }

        public String getYiyecegi() {
            return yiyecegi;
        }

        public void setYiyecegi(String yiyecegi) {
            this.yiyecegi = yiyecegi;
        }

        public int getYemekMiktari() {
            return yemekMiktari;
        }

        public void setYemekMiktari(int yemekMiktari) {
            this.yemekMiktari = yemekMiktari;
        }

        public int getGunlukUykuSuresi() {
            return gunlukUykuSuresi;
        }

        public void setGunlukUykuSuresi(int gunlukUykuSuresi) {
            this.gunlukUykuSuresi = gunlukUykuSuresi;
        }

        public String getSesi() {
            return sesi;
        }

        public void setSesi(String sesi) {
            this.sesi = sesi;
        }

        @Override
        public String toString() {
            return "Hayvan{" +
                    "id=" + id +
                    ", isim='" + isim + '\'' +
                    ", vahsi=" + vahsi +
                    ", dogumTarihi=" + dogumTarihi +
                    ", yiyecegi='" + yiyecegi + '\'' +
                    ", yemekMiktari=" + yemekMiktari +
                    ", gunlukUykuSuresi=" + gunlukUykuSuresi +
                    ", sesi='" + sesi + '\'' +
                    '}';
        }
    }

