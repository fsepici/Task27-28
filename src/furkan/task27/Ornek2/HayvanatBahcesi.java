package furkan.task27.Ornek2;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi hayvan = new Kedi();
        Kartal hayvan2=new Kartal();
hayvan.gunlukUykuSuresi();
hayvan2.gunlukUykuSuresi();
hayvan.yemekMiktari();
hayvan.sesi();
hayvan.yiyecegi();
hayvan2.sesi();
hayvan2.yemekMiktari();
hayvan2.yiyecegi();
        System.out.println("hayvan.getIsim() = " + hayvan.getIsim());
        hayvan.setIsim("loli");
        System.out.println("hayvan.getIsim() = " + hayvan.getIsim());


    }
}
