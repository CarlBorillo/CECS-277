package CECS277Midterm1;

public class CruiseShip extends Ship
{
    private int maxPassengers;

    public CruiseShip(String newName, int newYear, int newMaxPassengers)
    {
        super(newName, newYear);
        maxPassengers = newMaxPassengers;
    }

    public void setNumPassengers(int newMaxPassengers)
    {
        this.maxPassengers = newMaxPassengers;
    }

    public int getNumPassengers()
    {
        return this.maxPassengers;
    }
    @Override
    public String toString()
    {
        return ("Cruise Ship: " + super.getName() + " It was built in: " + super.getYear() + " Passengers: " +
                this.maxPassengers);
    }
}

