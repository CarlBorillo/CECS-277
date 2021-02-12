package Lab5;

public class CashRegisterTester {
    /**
     A class to test the CashRegister class.
     */
    public static void main(String[] args) {
        final CoinInRegister DOLLAR = new CoinInRegister(1.0, "Dollar");
        final CoinInRegister QUARTER = new CoinInRegister(0.25, "Quarter");

        CashRegister register = new CashRegister();

        register.recordPurchase(1.95);
        register.recordPurchase(1.40);
        register.enterPayment(3,DOLLAR);
        register.enterPayment(2, QUARTER);

        double change = register.giveChange();

        System.out.println(change);
        System.out.println("Expected: 0.15");
        }
    }
