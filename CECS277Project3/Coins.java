package CECS277Project3;

public class Coins {
    private double value;

    public Coins() {
        this.value = 0.00;
    }
    public Coins(double Val) {

        this.value = Val;
    }

    public double getValue() {

        return value;
    }

    public void setValue(double value) {

        this.value = value;
    }

    @Override
    public String toString() {

        return "@ " + value;
    }
}
