package ahmetC.task27.Ornek4;

public abstract class Bank {
  private String signature;
  private String identity;
  public static String bankName;
  protected double balance;

    @Override
    public String toString() {
        return "Bank{" +
                "signature='" + signature + '\'' +
                ", identity='" + identity + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Bank(String signature, String identity) {
        this.signature = signature;
        this.identity = identity;
        this.balance=20000;
    }
    abstract void openAccount();
    abstract void closeAccount();
    abstract String withdraw(double  withdrawMoney );
    abstract String deposit(double depositMoney );
    abstract String loan();

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
