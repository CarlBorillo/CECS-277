package CECS277Project3;

public class Products {
    private String description;
    private double price;

    /**
     * default constructor = sets description to empty and price to 0.00
     */
    public Products() {
        this.description = "";
        this.price = 0.00;



    }
    public Products(String desc, double Price) {
        this.description = desc;
        this.price = Price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public boolean equals(Object other) {
        if(other == null) {
            return false;
        }
        else {
            return this.price == ((Products) other).price && this.description.equals(((Products) other).description);
        }
    }

    @Override
    public String toString() {
        return
                description + "\n" +
                "price: " + price + " cents";
    }
}
