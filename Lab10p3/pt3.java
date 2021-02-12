package Lab10p3;
import java.util.*;
public class pt3
{
    public static void main(String [] args)
    {
        String text = "Good morning.Have a good class." + "Have a good visit.Have fun!";

        TreeMap<String, Integer> StringMap = new TreeMap<String,Integer>();

        String [] words = text.split("[ \n\t\r.,;:!?(){}]");

        for(int i =0; i< words.length;i++)
        {
            words[i] = words[i].toLowerCase();
            System.out.println(words[i]);
        }
        int count = 0;
        for (String s : words)
        {

            if (StringMap.containsKey(s))
            {
                StringMap.put(s, StringMap.get(s)+1);
            }
            else
            {
                StringMap.put(s, 1);
            }
        }


        System.out.println();
        for (String word: StringMap.keySet())
        {
            String key = word.toString();
            String value = StringMap.get(word).toString();
            System.out.println(key + " " + value);
        }
    }
}