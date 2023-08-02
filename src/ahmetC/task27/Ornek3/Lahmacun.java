package AhmetC.task27.Ornek3;

public class Lahmacun implements IFood {

    @Override
    public void taste() {
        System.out.println("İnce hamur ve zengin iç malzeme");
    }

    @Override
    public double ucret() {
        return 60.45;
    }


    void dough(){
        System.out.println("Lahmacun hamuru hazırlanıyor");
    }
    void topping(){
        System.out.println("Lahmacunun iç malzemesi ekleniyor");
    }
    void bake(){
        System.out.println("Lahmacun pişiriliyor");
    }
}
