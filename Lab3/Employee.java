package Lab3;



import java.util.Comparator;

public abstract class Employee implements Comparable <Employee> {
    private String LastName;
    private String FirstName;
    private String ID;

    public Employee() {
        LastName = "";
        FirstName = "";
        ID = "";


    }
    public Employee(String LastName, String FirstName, String ID){
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.ID = ID;
    }
    public String toString() {
        return "Last Name: " + LastName + "\nFirst Name: " + FirstName + "\nID: " + ID;

    }
    public int compareTo(Employee e) {
        return this.LastName.compareTo(e.LastName);
    }
    public static Comparator<Employee> iDComparatorDSD = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return 0;
        }
    };

    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public abstract double monthly_earning();

}
