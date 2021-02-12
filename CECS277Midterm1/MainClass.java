package CECS277Midterm1;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
        public static void main(String[] args)
        {
            ArrayList<Ship> ships = new ArrayList<Ship>();
            ships.add(new Ship("Queen Mary", 1986));
            ships.add(new Ship("USS Midway", 1946));
            ships.add(new CruiseShip("Carnival Pride", 2006, 3586));
            ships.add(new CruiseShip("Disney Cruise", 2020, 4000));
            ships.add(new CargoShip("Maersk", 1978, 100000));
            ships.add(new CargoShip("Frontline", 1988, 200000));
            System.out.println("Sorted by year: ");
            Collections.sort(ships);

            for (Ship ship : ships)
            {
                System.out.println(ship);
            }

        }
    }
