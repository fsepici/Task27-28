package AhmetC.task28.task01;

public class Dikdortgen implements Sekil{
    private int uzunKenar;
    private int kısaKenar;

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunKenar=" + uzunKenar +
                ", kısaKenar=" + kısaKenar +
                '}';
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKısaKenar() {
        return kısaKenar;
    }

    public void setKısaKenar(int kısaKenar) {
        this.kısaKenar = kısaKenar;
    }

    public Dikdortgen(int uzunKenar, int kısaKenar) {
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    @Override
    public double cevre(int... boyut) {
        return 2*(uzunKenar+kısaKenar);
    }

    @Override
    public double alan(int... boyut) {
        return kısaKenar*uzunKenar;
    }
}
