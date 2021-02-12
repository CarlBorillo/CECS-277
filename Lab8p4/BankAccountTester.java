package Lab8p4;

public class BankAccountTester {
    public static void main(String[] args)
    {
        BankAcct harrysChecking = new BankAcct();
        try
        {
            harrysChecking.deposit(300);
            System.out.println("success");
        }
        catch (NegativeAmountException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: success");
        try
        {
            harrysChecking.withdraw(100);
            System.out.println("success");
        }
        catch ( InsufficientFundsException | NegativeAmountException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: success");

        try
        {
            harrysChecking.deposit(-100);
            System.out.println("success");
        }
        catch (NegativeAmountException  e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");

        try
        {
            harrysChecking.withdraw(300);
            System.out.println("success");
        }
        catch ( InsufficientFundsException | NegativeAmountException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");
    }
}
