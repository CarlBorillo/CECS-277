package Lab14P2;

public interface Product {
    public abstract double accept(Visitor visitor);
    public abstract void display();
}
