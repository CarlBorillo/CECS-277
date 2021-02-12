package cecs277;
import java.util.*;

public class Student {
    public static void main(String[] args) {
        Student student1 = new Student("Robert", "1234");
        Student student2 = new Student("Bob", "4321");
        Student student3 = new Student(student1);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student1.equals(student3));

        // Array List adding
        ArrayList list = new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list.toString());
    }
    private String name;
    private String id;

    public Student (String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public Student (Student other)
    {
        this.name = other.name;
        this.id = other.id;
    }

    public String getName() {

        return name;
    }

    public String getID(){
        return id;

    }

    public String toString()
    { return "This student's name is: " + name + ", and this is the Student's ID number: " + id;

    }

    public boolean equals(Object other) {

        boolean result = false;
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            result = id.equals(((Student) other).id);
        }
        return result;
    }
}
