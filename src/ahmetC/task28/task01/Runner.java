package AhmetC.task28.task01;

public class Runner {
    public static void main(String[] args) {
    Sekil kare=new Kare(5);
    Sekil dikdörtgen=new Dikdortgen(6,7);
    Sekil cember=new Cember(8);
        System.out.println("kare = " + kare);
        System.out.println("kare.alan() = " + kare.alan());
        System.out.println("kare.cevre() = " + kare.cevre());
        System.out.println("dikdörtgen = " + dikdörtgen);
        System.out.println("dikdörtgen.alan() = " + dikdörtgen.alan());
        System.out.println("dikdörtgen.cevre() = " + dikdörtgen.cevre());
        System.out.println("cember = " + cember);
        System.out.println("cember.cevre() = " + cember.cevre());
        System.out.println("cember.alan() = " + cember.alan());

    }
}
