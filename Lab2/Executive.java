package Lab2;

public class Executive extends Manager {

    private Manager manager;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Manager todd = new Manager("Todd", 500, "Project Managment");

        Executive exec = new Executive("Carl", 344, "Project Management", todd);
        System.out.print(exec.toString());

    }

    public Executive(String name, int salary, String department, Manager manager) {
        super(name, salary, department);
        this.manager = manager;

        // TODO Auto-generated constructor stub
    }


    public String toString() {
        return super.toString() + ", " + "Manager: " + manager.name();
    }

}
