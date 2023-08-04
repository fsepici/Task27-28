package AhmetC.task27.Ornek3;

import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("****Lokantamıza Hoşgeldiniz*****" +
                    "\n               MENÜMÜZ\n" +
                    "1 ) ADANA KEBAP        50.45\n2 ) LAHMACUN     60.45\n3 ) BORSH        55.45 \n4 ) PALOV       53.34 \n Q ) ÇIKIŞ");
            String secim = input.nextLine().toUpperCase();
            switch (secim) {
                case "1":
                    TechnoKitchen.Pisir(1);
                    break;
                case "2":
                    TechnoKitchen.Pisir(2);
                    break;
                case "3":
                    TechnoKitchen.Pisir(3);
                    break;
                case "4":
                    TechnoKitchen.Pisir(4);
                    break;
                case "Q":
                    flag = true;
                    System.out.println("TechnoKitchen.toplamUcret = " + TechnoKitchen.toplamUcret);
                    System.out.println("Afiyet olsun.Tekrar bekleriz.");
                    break;
                default:
                    break;
            }
        }


    }
}