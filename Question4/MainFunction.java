package Question4;

public class MainFunction {

    public static void main(String args[]){


        BankAccount bankAccount = new BankAccount();
        bankAccount.Credit(5.0f);
        System.out.println("Balance(Bankaccount) is " +bankAccount.GetBalance());

        BankAccount account = new USDollarAccount();
        account.Credit(5.0f);
        System.out.println("Balance usdollar" + account.GetBalance());

    }
}
