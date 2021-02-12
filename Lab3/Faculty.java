package Lab3;

import static Lab3.EmployeeInfo.FACULTY_MONTHLY_SALARY;

public class Faculty extends Employee {
    Education edu;
        public enum Level {AO, AS, FU, NA};
    Level role;

    public Faculty() {
        super();
        edu = new Education();
        role = null;
    }

    public Faculty(String Lastname, String Firstname, String ID, Education newEducation, Level newRole) {
        setLastName(Lastname);
        setFirstName(Firstname);
        setID(ID);
        setRole(newRole);
        edu = newEducation;

    }

    public Level getRole()
    {
        return this.role;
    }

    public void setRole(Level newRole)
    {
        this.role = newRole;
    }

    public void setEducation(Education newEducation)
    {
        edu = newEducation;
    }

    public Education getLevel() {
        return edu;
    }

    @Override
    public double monthly_earning()
    {
        double monthlyEarning = 0.0;
        if (this.role == Level.AS)
        {
            return monthlyEarning = FACULTY_MONTHLY_SALARY;
        }
        else if (this.role == Level.AO)
        {
            return monthlyEarning = FACULTY_MONTHLY_SALARY *1.5;
        }
        else if (this.role == Level.FU)
        {
            return monthlyEarning = FACULTY_MONTHLY_SALARY *2;
        }
        return monthlyEarning;
    }

    public String toString()
    {
        return super.toString() + " Professor: " + role +
                "\nMonthly Salary: " + monthly_earning();
    }
}











