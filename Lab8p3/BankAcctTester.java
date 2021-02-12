package Lab8p3;

public class BankAcctTester {
    public static void main(String[] args)
    {
        BankAccount harrysChecking = new BankAccount();

        try
        {
            harrysChecking.deposit(300);
            System.out.println("success");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: success");

        try
        {
            harrysChecking.withdraw(100);
            System.out.println("success");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: success");

        try
        {
            harrysChecking.deposit(-100);
            System.out.println("success");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");

        try
        {
            harrysChecking.withdraw(300);
            System.out.println("success");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("exception");
        }
        System.out.println("Expected: exception");
    }
}
