package Lab8p4;

public class InsufficientFundsException extends Exception
{
    public InsufficientFundsException()
    {
    }

    public InsufficientFundsException(String message)
    {
        super(message);
    }
}
