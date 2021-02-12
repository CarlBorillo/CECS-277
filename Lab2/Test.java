package Lab2;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Emp man = new Emp("matt", 33);
        System.out.println(man.toString());

        Manager manager = new Manager("Todd", 24, "Sales");
        System.out.println(manager.toString());

        Manager todd = new Manager("Todd", 500, "Project Managment");

        Executive exec = new Executive("Carl", 344, "Project Management", todd);
        System.out.println(exec.toString());


    }

}

