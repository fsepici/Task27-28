package ahmetC.task27.Ornek4;

import java.util.Scanner;

public class BankingSystem  {
       static Scanner input=new Scanner(System.in);
    public static String bankName;
    public static void main(String[] args) {
      inputPanel();

    }
    public static void inputPanel(){
        System.out.println("*****Welcome to the Banking System******\n" +
                "Which bank would you like to open an account with?\n" +
                "1 ) BANK BOA \n 2 ) BANK ChaseBANK\n 3 ) BANK WellsFargo\n" +
                "Q ) Quit");
        switch (input.nextLine().toUpperCase()){
            case "1":
                System.out.println("Enter your signature");
                String signature1=input.nextLine();
                System.out.println("Enter your identity");
                String identity1=input.nextLine();
                System.out.println("Please enter the required document for our Bank");
                String doc1=input.nextLine();
                Bank bankBoa=new BOA(signature1,identity1,doc1);
                bankName="BOA";
                bankingOperation(bankBoa);
                break;
            case "2":
                System.out.println("Enter your signature for our bank");
                String signature2=input.nextLine();
                System.out.println("Enter your identity");
                String identity2=input.nextLine();
                System.out.println("Please enter the required document for our Bank");
                String doc2=input.nextLine();
                Bank chaseBank=new ChaseBank(signature2,identity2,doc2);
                bankName="ChaseBANK";
                bankingOperation(chaseBank);
                break;
            case "3":
                System.out.println("Enter your signature for our bank");
                String signature3=input.nextLine();
                System.out.println("Enter your identity");
                String identity3=input.nextLine();
                System.out.println("Please enter the required document for our Bank");
                String doc3=input.nextLine();
                Bank WellsFargo=new WellsFargo(signature3,identity3,doc3);
                bankName="WellsFargo";
                bankingOperation(WellsFargo);
                break;
            case "Q":
                System.out.println("Good bye. We will expect to coming again our bank");
                break;
            default:
                System.out.println("Please enter available choise");
                inputPanel();
                break;
        }
    }


    private static void bankingOperation(Bank bank) {
        System.out.println("Welcome to "+bankName+" Bank\n" +
                "Please choose your operation\n" +
                "1 ) WİTHDRAW MONEY \n 2 ) DEPOSİT MONEY \n 3) LOAN ");
            bank.openAccount();
        switch (input.nextInt()){
            case 1:
                System.out.println("How much do you want to withdraw");
                 bank.withdraw(input.nextDouble());
                System.out.println("bank.balance = " + bank.balance);
                System.out.println("Thank you. If you have another operation.You are redirected to the main menu");
                bankingOperation(bank);
                break;
            case 2:
                System.out.println("How much do you want to deposit");
                bank.deposit(input.nextDouble());
                System.out.println("bank.balance = " + bank.balance);
                System.out.println("Thank you. If you have another operation.You are redirected to the main menu");
                bankingOperation(bank);
                break;
            case 3 :
                System.out.println("Do you want to loan via our bank?");
                bank.loan();
                System.out.println("bank.balance = " + bank.balance);
                System.out.println("Thank you. If you have another operation.You are redirected to the main menu");
                bankingOperation(bank);
                break;
            default:
                System.out.println("Please choose correct number");
                bankingOperation(bank);
                break;

        }

    }



}

