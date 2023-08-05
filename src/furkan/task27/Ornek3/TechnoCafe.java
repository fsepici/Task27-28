package furkan.task27.Ornek3;

import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        menu();


    }

    private static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("***********  M E N Ü  *************\n1-Borsh\n2-Palov\n3-Lahmacun\n4-Adana Kebap\n0-Siparişi Tamamla");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                Borsh obj1 = new Borsh();


        }


    }
}