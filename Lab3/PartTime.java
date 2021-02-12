package Lab3;

public class PartTime extends Staff {
    private int hoursWorkedWeek;
    private final int WeekMonth;

    public PartTime() {
        hoursWorkedWeek = 0;
        WeekMonth = 4;
    }
    public PartTime(String Lastname, String Firstname, String iD,double HourRate, int hoursWorkedWeek){
        WeekMonth = 4;
        this.hoursWorkedWeek = hoursWorkedWeek;
        setID(iD);
        setFirstName(Firstname);
        setLastName(Lastname);
        setHourRate(HourRate);
        setHours(hoursWorkedWeek);

    }
    public void setHours(int hoursWorkedWeek) {

        this.hoursWorkedWeek = hoursWorkedWeek;
    }
    public int getHours() {

        return hoursWorkedWeek;
    }
    public int getHourPerMonth() {

        return getHours() * WeekMonth;
    }

    @Override
    public double monthly_earning() {

        return getHours() * getHourRate() * WeekMonth;
    }
    public String toString(){
        return "Employee Name: " + getFirstName() +" " + getLastName() + "\nI.D. Number: " + getID() + "\nHours worked per month: " + getHourPerMonth() + "\nMonthly Salary: " + monthly_earning();


    }
}
