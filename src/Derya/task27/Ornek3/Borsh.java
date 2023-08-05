package Derya.task27.Ornek3;



public  class Borsh implements IFood {
    public void boil(){
        System.out.println("çorba kaynıyor");
    }


    @Override
    public void taste() {

    }

    @Override
    public double ucret() {
        return 11.1;
    }
}
