package Derya.task27.Ornek3;
import java.util.Scanner;

public  class  TechnoCafe{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adana Kebab");
            System.out.println("2. Lahmacun");
            System.out.println("3. Borsh");
            System.out.println("4. Palov");
            System.out.println("0. Siparişi Tamamla");
            System.out.print("Lütfen siparişinizin numarasını seçiniz: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice == 1) {
                AdanaKebap adanaKebap = new AdanaKebap();
                adanaKebap.grill();
            } else if (choice == 2) {
                Lahmacun lahmacun = new Lahmacun();
                lahmacun.dough();
            } else if (choice == 3) {
                Borsh borsh = new Borsh();
            borsh.boil();
            } else if (choice == 4) {
                Palov palov = new Palov();
                palov.fry();
            } else {
                System.out.println("Geçersiz bir seçim yaptınız!");
            }
        }

        scanner.close();
    }
}




