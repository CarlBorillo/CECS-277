package Lab9;
import java.util.*;
import java.util.Scanner;
public class CecsLab9 {
        static Scanner input = new Scanner(System.in);
        public static Set<Integer> WinningNumbers()
        {
            int max = 40;
            int min = 1;
            Set<Integer> winningNum = new TreeSet<Integer>();
            for (int i = 0; i < 6; i++)
            {
                int num = (int) (Math.random() * (max - min + 1) + min);
                winningNum.add(num);
            }
            return winningNum;
        }

        public static Set<Integer> getTicket()
        {
            Set<Integer> ticket = new TreeSet<Integer>();
            for (int i = 0; i < 6; i++)
            {
                System.out.print("Enter your numbers: ");
                int num = input.nextInt();
                ticket.add(num);
            }
            return ticket;
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Set<Integer> a = WinningNumbers();
            Set<Integer> b = getTicket();
            System.out.println("The winning numbers: ");
            System.out.print(a);
            System.out.println();
            System.out.println("Your numbers: ");
            System.out.print(b);
            System.out.println();
            System.out.println("Matched numbers: ");
            a.retainAll(b);
            System.out.print(a);
            if (a.size() == 1)
                System.out.println("You won $250");
            else if (a.size() == 2)
                System.out.println("You won $500");
            else if (a.size() == 3)
                System.out.println("You won $750");
            else if (a.size() == 4)
                System.out.println("You won $1000");
            else if (a.size() == 5)
                System.out.println("You won $1250");
            else if (a.size() == 6)
                System.out.println("You won $1500");
            else if (a.size() == 0)
                System.out.println("Loser");


        }

    }

