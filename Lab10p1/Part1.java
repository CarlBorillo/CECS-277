package Lab10p1;

import java.util.HashSet;
import java.util.Set;

public class Part1 {
    public static  Set<String> intersection(Set<String> s1, Set<String> s2)
    {
        Set<String> s3 = new HashSet<String>();
        for(Object c : s1) {
            if(s2.contains(c)) {
                s3.add((String) c);
            }
        }
        return s3;
    }
    public static void main(String[] args)
    {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();
        s1.add("aa");
        s1.add("bb");
        s1.add("cc");
        s2.add("dd");
        s2.add("cc");
        s2.add("bb");
        Set<String> s3 = new HashSet<String>();
        s3 = intersection(s1,s2);
        System.out.println(s3);
    }


}
