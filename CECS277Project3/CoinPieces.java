package CECS277Project3;

import java.util.ArrayList;

public class CoinPieces {
    private ArrayList<Coins> set;

    /**
     * default constructor, sets CoinSet arraylist to null
     */
    public CoinPieces()
    {
        this.set = new ArrayList<Coins>();
    }

    /**
     * overloaded constructor, sets CoinSet to a given arraylist
     * @param s - CoinSet to set to, as an arraylist
     */
    public CoinPieces(ArrayList<Coins> s)
    {
        this.set = s;
    }

    /**
     * adds a coin to the arraylist in CoinSet
     * @param c - Coin object to add
     */
    public void addCoins(Coins c)
    {
        set.add(c);
    }

    /**
     * gets the value of the CoinSet
     * @return a double representing the numerical total of all coins in the set
     */
    public double getValue()
    {
        double total = 0.0;
        for(Coins s : set)
        {
            total += s.getValue();
        }
        return total;
    }

    /**
     * removes all coins from the set
     */
    public void removeCoins()
    {
        set.clear();
    }

    /**
     * adds another CoinSet to this CoinSet
     * @param other - CoinSet to add
     */
    public void addCoins(CoinPieces other)
    {
        for(Coins c : other.set)
        {
            set.add(c);
        }
    }

}

