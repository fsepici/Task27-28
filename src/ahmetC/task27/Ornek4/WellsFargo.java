package AhmetC.task27.Ornek4;

public class WellsFargo extends Bank {
        private String requiredDocument2;


    public WellsFargo(String signature, String identity,String requiredDocument2) {
        super(signature, identity);
        this.requiredDocument2=requiredDocument2;
       Bank.bankName="BOA";
    }

    @Override
    void openAccount() {
        System.out.println("Bank WellsFargo Account was opened.Required Document = "+requiredDocument2);
    }

    @Override
    void closeAccount() {
        System.out.println("Bank WellsFargo Account was closed.");
    }

    @Override
    String withdraw(double withdrawMoney) {
            if (withdrawMoney <= balance) {
                balance -= withdrawMoney;
                return withdrawMoney + " TL was withdrawed from your account." + "Your new balance is " + balance;

            } else return "Insufficient funds in Bank WellsFargo  Account.Sorry.";
        }



    @Override
    String deposit(double depositMoney) {
        balance+=depositMoney;
        return depositMoney+" TL was deposited your account in WellsFargo \n"+"your new balance is "+balance;
    }

    @Override
    String loan() {
        return "Loan amount calculated for Bank WellsFargo.";
    }
}
