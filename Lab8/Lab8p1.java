package Lab8;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Lab8p1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int chances = 0;
        boolean done = false;
        double sum = 0;
        String finish = "";
        while (!done)
        {
            double value = 0;
            try
            {  //Input the double value
                //Accumulate
                System.out.print("Enter your double value: ");
                value = in.nextDouble();
                sum = sum + value;
                System.out.print("Are you finished? ");
                finish = in.next();
                if (finish.equals("Yes") || finish.equals("yes"))
                    done = true;
            }
            catch (InputMismatchException e)
            {
                //Display "Input error. Try again."
                //Read the bad input
                //other code
                System.out.println("Input error, try again.");
                String WrongInput = in.next();
                chances++;
                if (chances > 1)
                {
                    System.out.println("Wrong input again.");
                    done = true;
                }
            }
        }
        //Display the sum
        System.out.println("Sum is " + sum);
    }
}

