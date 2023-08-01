package ahmetC.task27.Ornek4;

public class ChaseBank extends Bank {
    private String requiredDocument1;
    public static String bankName="chaseBank";
    public ChaseBank(String signature, String identity,String requiredDocument1) {
        super(signature, identity);
        this.requiredDocument1=requiredDocument1;
    }

    @Override
    void openAccount() {
        System.out.println("Bank ChaseBank Account was opened.Required Document = "+requiredDocument1);

    }

    @Override
    void closeAccount() {
        System.out.println("Bank ChaseBank Account was closed.");
    }

    @Override
    String withdraw(double withdrawMoney) {
            if (withdrawMoney <= balance) {
                balance -= withdrawMoney;
                return withdrawMoney + " TL was withdrawed from your account." + "Your new balance is " + balance;

            } else return "Insufficient funds in Bank ChaseBank Account.Sorry.";
    }

    @Override
    String deposit(double depositMoney) {
        balance+=depositMoney;
        return depositMoney+" TL was deposited your account in BOA\n"+"your new balance is "+balance;
    }

    @Override
    String loan() {
        return "Loan amount calculated for Bank ChaseBank.";
    }
}