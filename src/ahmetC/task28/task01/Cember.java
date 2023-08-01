package ahmetC.task28.task01;

public class Cember implements Sekil{
    private int yariCap;

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + yariCap +
                '}';
    }

    public int getYariCap() {
        return yariCap;
    }

    public void setYariCap(int yariCap) {
        this.yariCap = yariCap;
    }

    public Cember(int yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double cevre(int... boyut) {
        return 2*PI*yariCap;
    }

    @Override
    public double alan(int... boyut) {
        return PI*Math.pow(yariCap,2);
    }
}
