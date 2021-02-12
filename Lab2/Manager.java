package Lab2;

public class Manager extends Emp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Manager manager = new Manager("Todd", 24, "Sales");

        System.out.print(manager.toString());

    }

    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
        // TODO Auto-generated constructor stub
    }

    public String name(){
        return super.name();
    }

    public String toString() {
        return super.toString() + "," + " Department name: " + department;
    }

}
