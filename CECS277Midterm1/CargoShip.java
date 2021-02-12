package CECS277Midterm1;

public class CargoShip extends Ship
{
    private int tonnage;

    public CargoShip(String newName, int newYear, int newTonnage)
    {
        super(newName, newYear);
        this.tonnage = newTonnage;
    }

    public void setCargoCapacity(int newTonnage)
    {
        this.tonnage = newTonnage;
    }

    public int getCargoCapacity()
    {
        return this.tonnage;
    }
    public String toString()
    {
        return ("Cargo Ship: " + super.getName() + " It was built in: " + super.getYear() + " - tonnage: " + this.tonnage);
    }
}
