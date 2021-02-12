package Lab13;

import java.util.*;

public class PizzaDelivery {
    public static void main(String[] args) {
// YOUR CODE to input user's pizza order and then display the pizza using toString method. Scanner input = new Scanner(System.in);
        System.out.println("Enter your pizza order: ");
        Scanner input = new Scanner(System.in);
        String order = input.next();
        Pizzafactory factory = new Pizzafactory();
        Pizza pizza = factory.orderPizza(order);
        System.out.println(pizza.toString());
    }
}
