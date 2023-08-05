package furkan.task27.Ornek4;

public abstract class Bank {

    public Bank() {
    }

    String name;
    String phoneNumber;
    String adress;
    int numEmployee;
    String loan;
    double balance;


    public abstract void openAccount(String imza, String kimlik);

   // public abstract void closeAccount(imza, kimlik, hesap kontrol);

    //public  String withdraw(double gidenPara);


//    public String deposit(double gelenPara) ;


}
