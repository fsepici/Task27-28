package ahmetC.task27.Ornek2;


import java.time.LocalDate;

public abstract class Hayvan {
    private String isim;
    private int id;
    private boolean vahsi;
    private LocalDate dogumTarihi;

    public abstract void yiyecek();
    abstract void yemekMiktar();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public Hayvan(String isim, int id, boolean vahsi, LocalDate dogumTarihi) {
        this.isim = isim;
        this.id = id;
        this.vahsi = vahsi;
        this.dogumTarihi = dogumTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "isim='" + isim + '\'' +
                ", id=" + id +
                ", vahsi=" + vahsi +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
