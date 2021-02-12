package Lab10p2;
import java.util.*;
public class Employee2 implements Comparable<Employee2>
{
    String name;
    double salary;
    public Employee2(String name, double s)
    {
        this.name = name;
        salary = s;
    }
    public String toString()
    {
        return ( this.name + "," + this.salary);
    }

    @Override
    public int compareTo(Employee2 o) {
        return this.name.compareTo(o.name);
    }


}
