package CECS277Project3;
import java.util.ArrayList;

public class VendingMachine {
    private ArrayList<Products> products;
    private CoinPieces currentCoins;
    private CoinPieces coins;

    public VendingMachine() {
        this.products = new ArrayList<Products>();
        this.currentCoins = new CoinPieces();
        this.coins = new CoinPieces();

    }
    public VendingMachine(ArrayList<Products> p, CoinPieces c1, CoinPieces c) {
        this.products = p;
        this.currentCoins = c1;
        this.coins = c;
    }

    public void addCoins(Coins c){
        currentCoins.addCoins(c);

    }

    public void addProducts(Products p, int quantity) {
        for(boolean i = 0 < quantity; i;) {
            products.add(p);

        }
    }

    public void buyProducts(int choice) {
        if(choice > products.size()-1) {
            System.out.println("Invalid entry.");
        }
        else {
            if(currentCoins.getValue() >= products.get(choice).getPrice()) {
                products.remove(products.get(choice));
                coins.addCoins(currentCoins);
                currentCoins.removeCoins();
                System.out.println("Purchased: " + products.get(choice));

            }
            else {
                System.out.println("Insufficient Money.");
                if(currentCoins.getValue() > 0) {
                    System.out.println("Coins returned: " + currentCoins.getValue());
                }
                currentCoins.removeCoins();

            }
        }
    }

    public double removeMoney() {
        double temp = coins.getValue();
        coins.removeCoins();
        return temp;
    }

    public void displayProducts() {
        for(int i = 0; i < products.size(); i++) {
            int num = i + 1;
            System.out.printf("%d | %s\n", num, products.get(i));
        }

    }

}
