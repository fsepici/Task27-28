package Derya.task27.Ornek3;

import task27.Ornek3.IFood;

public class Lahmacun implements IFood {

    public void dough() {
        System.out.println("Hamur ince ve leziz");
    }

    public void topping() {
        System.out.println("Lezzet şöleni");

    }

    public void bake() {
        System.out.println("lahmacun pişiyor");

    }

    public void taste() {
        System.out.println("Lahmacun nefis!");
    }

    public double ucret() {
        return 8.50;
    }
}





