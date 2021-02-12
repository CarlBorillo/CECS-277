package Lab10p2;

import java.util.*;


public class pt2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Employee2> EmployeeSet = new TreeSet<Employee2>();
        //Set<Employee> EmployeeSet = new TreeSet<Employee>(new SalaryComparator());
        Employee2 e1 = new Employee2 ("eee",78000.0);
        Employee2 e2 = new Employee2 ("bbb",45000.0);
        Employee2 e3 = new Employee2 ("ccc",100000.0);
        EmployeeSet.add(e1);
        EmployeeSet.add(e2);
        EmployeeSet.add(e3);
        Iterator get = EmployeeSet.iterator();
        while (get.hasNext())
        {
            System.out.println(get.next().toString());
        }



    }

}
