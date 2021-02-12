/**
 * The LotteryTicket program displays a user generated
 * list of randomized numbers to display an output.
 *
 * @author  Michael Hannigan, Carl Borillo, Krimika Keemtee
 * @professor Mimi Opkins CECS 277 Sec 07 7518
 * @since   09-09-2020
 */

package cecs277;
import java.util.*;

public class LotteryTicket {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("How many sets of numbers do you want?: "); // Prompt displayed for user.
        Scanner input = new Scanner(System.in); // User input as to how many sets the user desires.


        // assigns the user input number to integer variable number
        int number = input.nextInt();

        // Input validation w/ while loop to ask user for number until they give number greater than 0
        if(number<1 ) {

            number = 0;
            while(number<1) {
                System.out.print("That was not a valid number please give a number greater than zero: ");
                Scanner input2 = new Scanner(System.in);
                number = input2.nextInt();
            }
        }


        // Java Library will create the a list of Integers.
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Uses the Random class
        Random rand = new Random();
        // A variable that helps us get a random int between 1-49
        final int RANGE = 49;
        // j indicates the user input of sets desired
        for(int j = 0; j<number; j++) {

            // for loop used to place 6 randomly generated numbers in sets defined by user.
            for(int i = 0; i<6; i++) {
                int num = (int) ( RANGE * Math.random() ) + 1;
                //while loop ensures no repeated numbers
                //using the contains method from the ArrayList class
                while(list.contains(num)) {

                    num = rand.nextInt(50);
                }

                // adds number to list using add method from ArrayList Class
                list.add(num);

            }

            // Calling the sort method through the Collections class to sort the list from low to high
            Collections.sort(list);

            //Prints out the list once all integers are added
            System.out.println(list);

            //clears the list in order to populate it if more sets are asked for
            list.clear();

        }

    }

}
