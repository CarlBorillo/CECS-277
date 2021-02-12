package Lab2;

public class Emp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Emp man = new Emp("matt", 33);
        System.out.print(man.toString());
    }


    private String name;
    private int salary;

    public Emp(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String name() {
        return name;
    }
    public String toString() {
        return "Name: " + name + "," + " Salary: " + salary;
    }

}
