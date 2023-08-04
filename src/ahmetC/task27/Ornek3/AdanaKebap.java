package AhmetC.task27.Ornek3;

public class AdanaKebap implements IFood {

    @Override
    public void taste() {
        System.out.println("Adana kebabının tadı baharatlı ve lezzetlidir");
    }

    @Override
    public double ucret() {
        return 50.45;
    }


    void marinade(){
        System.out.println("Adana kebabı marine ediliyor");
    }
    void grill(){
        System.out.println("Adana kebabı ızgarada pişiriliyor");
    }
}
