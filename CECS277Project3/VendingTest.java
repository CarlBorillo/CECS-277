package CECS277Project3;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class VendingTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int letter = 0;

        String[] alpha = {"A", "B", "I", "R", "Q", "S"};
        System.out.println("------products-------");
        ArrayList<Products> product = new ArrayList<>();
        product.add(new Products("Candy", 0.25));
        product.add(new Products("Cookie", 0.65));
        product.add(new Products("Chips", 0.85));
        product.add(new Products("Soda", 0.75));
        System.out.println(product);


        int x = 1;
        int q, b;
        double p;
        String ans, choice, i;
        double Coins = 0.00;
        double total = 0.00;

        System.out.println("S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit");
        ans = scan.next();
        while (x > 0) {
            System.out.println("S)how products I)nsert coin B)uy A)dd product R)emove coins Q)uit");
            ans = scan.next();
            /**
             * show the products listed by printing out the array with toString
             */
            if (ans.equals("S")) {
                for (Products str : product)
                    System.out.println(str);

            } else if (ans.equals("I")) {
                Coins c1 = new Coins(0.05);
                Coins c2 = new Coins(0.10);
                Coins c3 = new Coins(0.25);
                Coins c4 = new Coins(1.00);
                System.out.println("A) Nickel " + c1.toString() + " B) Dime " + c2.toString() + " C) Quarter " + c3.toString() + " D) Dollar " + c4.toString());
                choice = scan.next();

                switch (choice) {
                    case "A" -> {
                        Coins += 0.05;
                        System.out.println("Your current Balance is: " + Coins);
                    }
                    case "B" -> {
                        Coins += 0.10;
                        System.out.println("Your current Balance is: " + Coins);
                    }
                    case "C" -> {
                        Coins += 0.25;
                        System.out.println("Your current Balance is: " + Coins);
                    }
                    case "D" -> {
                        Coins += 1.00;
                        System.out.println("Your current Balance is: " + Coins);
                    }
                }
            }
                else if (ans.equals("B")) {
                b = 0;
                for (Products str : product)
                    System.out.println(str);
                ans = scan.next();
                ans = ans.toUpperCase();
                while(b >- 1){
                    if(product.get(b).equals(ans)) {
                        if(product.get(b).equals(Coins)){
                            System.out.println("Purchased: " + product.get(b).getDescription() + " @ $" + product.get(b).getPrice());
                            Coins -= product.get(b).getPrice();
                            total += product.get(b).getPrice();
                            System.out.println("Your Change: $" + Coins);
                            Coins = 0;
                            break;
                        }
                        else
                            System.out.println("Insufficient money or lack of quantity");
                        break;
                    }
                    else
                        b++;
                }

            }

            }



        }
    }

