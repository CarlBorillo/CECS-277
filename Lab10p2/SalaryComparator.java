package Lab10p2;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee2> {

    // This compares employees based on salaries
    public int compare(Employee2 o1, Employee2 o2) {
        if (o1.salary >= o2.salary) {
            return 1;
        } else {
            return -1;
        }
    }



}
