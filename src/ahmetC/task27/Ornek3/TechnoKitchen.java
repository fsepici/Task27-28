package ahmetC.task27.Ornek3;

public class TechnoKitchen {
   static double toplamUcret = 0;
    public static double Pisir(int siparisNo) {
        Palov palov = new Palov();
        AdanaKebap adanaKebapkebap = new AdanaKebap();
        Borsh borsh = new Borsh();
        Lahmacun lahmacun = new Lahmacun();

        switch (siparisNo) {
            case 1:
                adanaKebapkebap.marinade();
                adanaKebapkebap.grill();
                adanaKebapkebap.taste();
                toplamUcret += adanaKebapkebap.ucret();
                System.out.println("toplamUcret = " + toplamUcret);
                System.out.println("Başka bir siparişiniz var mı?\n Ana menüye yönlendiriliyorsunuz");
                break;
            case 2:
                lahmacun.dough();
                lahmacun.topping();
                lahmacun.bake();
                lahmacun.taste();
                toplamUcret += lahmacun.ucret();
                System.out.println("toplamUcret = " + toplamUcret);
                System.out.println("Başka bir siparişiniz var mı?\n Ana menüye yönlendiriliyorsunuz");
                break;
            case 3:
                borsh.boil();
                borsh.taste();
                toplamUcret += borsh.ucret();
                System.out.println("toplamUcret = " + toplamUcret);
                System.out.println("Başka bir siparişiniz var mı?\n Ana menüye yönlendiriliyorsunuz");
                break;
            case 4:
                palov.boil();
                palov.fry();
                palov.taste();
                toplamUcret += palov.ucret();
                System.out.println("toplamUcret = " + toplamUcret);
                System.out.println("Başka bir siparişiniz var mı?\n Ana menüye yönlendiriliyorsunuz");
                break;
            default:
                System.out.println("Please try again ");
        }
        return toplamUcret;
    }
}

