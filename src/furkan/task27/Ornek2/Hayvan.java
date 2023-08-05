package furkan.task27.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {
    private int id ;
    private String isim;
    private boolean vahsi;
    private LocalDate dogumTarihi;

    public abstract void yiyecegi();

    public abstract void yemekMiktari();
    public abstract void gunlukUykuSuresi();
    public abstract void sesi();

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

    @Override
    public String toString() {
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
