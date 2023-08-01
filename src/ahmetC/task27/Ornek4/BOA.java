package ahmetC.task27.Ornek4;

public class BOA extends Bank {
    private String requiredDocument;
    public static String bankName="BOA";

    public BOA(String signature, String identity, String requiredDocument) {
        super(signature, identity);
        this.requiredDocument = requiredDocument;
    }

    @Override
    void openAccount() {
        System.out.println("Bank BOA Account was opened.Required document " + requiredDocument);
    }

    @Override
    void closeAccount() {
        System.out.println("Bank BOA Account was closed");
    }

    @Override
    String withdraw(double withdrawMoney) {
        if (withdrawMoney <= balance) {
            balance -= withdrawMoney;
            return withdrawMoney + " TL was withdrawed from your account." + "Your new balance is " + balance;

        } else return "Insufficient funds in Bank BOA Account.Sorry.";
    }



    @Override
    String deposit(double depositMoney) {
        balance+=depositMoney;
        return depositMoney+" TL was deposited your account in BOA\n"+"your new balance is "+balance;


    }

    @Override
    String loan() {
        return "Loan amount calculated for Bank BOA.";
    }


}
