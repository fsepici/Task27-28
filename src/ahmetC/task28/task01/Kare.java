package ahmetC.task28.task01;

public class Kare implements Sekil{
    private int kenarUzunluk;

    public Kare(int kenarUzunluk) {
        this.kenarUzunluk = kenarUzunluk;
    }

    public int getKenarUzunluk() {
        return kenarUzunluk;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenarUzunluk=" + kenarUzunluk +
                '}';
    }

    public void setKenarUzunluk(int kenarUzunluk) {
        this.kenarUzunluk = kenarUzunluk;
    }

    @Override
    public double cevre(int... boyut) {
        return 4*kenarUzunluk;
    }

    @Override
    public double alan(int... boyut) {
        return  Math.pow(kenarUzunluk,2);
    }
}
