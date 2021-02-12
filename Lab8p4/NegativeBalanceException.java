package Lab8p4;

public class NegativeBalanceException extends Exception
{
    public NegativeBalanceException()
    {
    }

    public NegativeBalanceException(String message)
    {
        super(message);
    }
}
