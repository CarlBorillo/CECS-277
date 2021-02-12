package MidtermP2;
import java.io.*;
import java.util.Scanner;

public class ReplaceText {

        static void modifyFile(String java, String ReplaceText, String oldString, String newString)
        {
            File fileToBeModified = new File("randomwords.txt");

            String oldWord = "";

            BufferedReader reader = null;

            FileWriter writer = null;

            try
            {
                reader = new BufferedReader(new FileReader(fileToBeModified));


                String line = reader.readLine();

                while (line != null)
                {
                    oldString = oldWord + line + System.lineSeparator();

                    line = reader.readLine();
                }


                String newWord = oldWord.replaceAll(oldString, newString);


                writer = new FileWriter(fileToBeModified);

                writer.write(newWord);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {

                    assert reader != null;
                    reader.close();

                    assert writer != null;
                    writer.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args)
        {
            Scanner in = null;
            File input = null;
            PrintWriter out = null;
            try{
                in = new Scanner(System.in);
                System.out.println("Enter a file name:");
                input = new File(in.nextLine());
                System.out.println("Enter a file output name:");
                out = new PrintWriter(new PrintStream(in.nextLine()));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            modifyFile("C:/randomwords.txt", "the", "the", "abc");

            System.out.println("done");
        }
    }
