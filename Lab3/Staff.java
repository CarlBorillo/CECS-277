package Lab3;

import static Lab3.EmployeeInfo.STAFF_MONTHLY_HOURS_WORKED;

public class Staff extends Employee {

    private double HourRate;

    public Staff() {
        HourRate = 0.00;

    }

    public Staff(String nameLast, String nameFirst, String iD, double HourRate){
        setFirstName(nameFirst);
        setLastName(nameLast);
        setID(iD);
        setHourRate(HourRate);
    }
    public double getHourRate(){

        return HourRate;
    }
    public void setHourRate(double HourRate){

        this.HourRate = HourRate;
    }
    @Override
    public double monthly_earning(){

        return STAFF_MONTHLY_HOURS_WORKED * getHourRate();
    }
    public String toString(){
        String iD = super.getID();
        String Last = super.getLastName();
        String First = super.getFirstName();

        return "Last Name: " + Last + "\nFirst Name: " + First + "\nID: " + iD + "\nHourly Rate: " + getHourRate() +  "\nMonthly Salary: " + monthly_earning() + "\nFull Time";
    }




}
