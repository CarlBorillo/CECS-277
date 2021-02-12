package Lab5;

/**
 A cash register totals up sales and computes change due.
 */
/**This program calculates the total sale and also the change due
 *
 * @author Shashi Kumar Kadari Mallikarjuna
 */
public class CashRegister {
    private double purchase;
    private double payment;
    /**Constructor description of CashRegister*/
    public CashRegister() {
        purchase=0.0;
        payment=0.0;
    }
    /**This method assigns the purchase with the total purchase amount
     * @param amount The total purchase amount
     */
    public void recordPurchase(double amount) {
        purchase = amount;
    }
    /**This method calculates the total payment for the purchase
     * @param unitCount The number of bills or coins
     * @param type The value of the bill or coin.
     */
    public void enterPayment(int unitCount, CoinInRegister type ) {
        payment+=unitCount*type.getaValue();
    }
    /**calculates the change that needs to be returned if the payment is greater
     * than the purchase and it returns the payment back if the payment is less than the purchase
     * @return the difference between the payment and the purchase.
     */
    public double giveChange() {
        if(purchase > payment) {
            return payment;
        }
        else
            return payment - purchase;
    }
}


