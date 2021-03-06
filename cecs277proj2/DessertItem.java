package cecs277proj2;
/**
 * This class will give us information on a Dessert item as well as implement Comparable
 * which will compare the calories between two Dessert Items
 * @author michaelhannigan, CarlBorillo, krimikaKeemtee
 *
 */
public abstract class DessertItem implements Comparable<DessertItem>{

    protected String name;
    protected double calories;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {

    }
    /**
     * Initializes DessertItem data
     * @param name = the name of the Dessert Item
     * @param calories = the amount of calories for the Dessert Item
     */
    public DessertItem(String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    /**
     * name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }

    public final void setName(String n) {
        this.name = n;
    }

    public final double getCalories() {
        return calories;
    }

    public final void setCalories(double cal) {
        this.calories = cal;
    }

    //the method to help the max method in the abstract class
    @Override
    public int compareTo(DessertItem o) {
        // TODO Auto-generated method stub
        if(this.getCalories()>o.getCalories()) {
            return 1;
        }
        if(this.getCalories()==o.getCalories()) {
            return 0;
        }else {
            return -1;
        }

    }


    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    //gathers the cost of the Dessert Item
    public abstract double getCost();

    public abstract String getType();
    /**
     * @return the type of Dessert Item
     */
    // This method will return either Dessert Item 1 or Dessert Item 2 based on the compareTo function
    public static DessertItem max(DessertItem o1, DessertItem o2) {
        /**
         * Initializes the compareTo function to compare Dessert Item o1 and Dessert Item o2 based on calorie amount
         * @param o1 = Dessert Item 1
         *
         */
        if(o1.compareTo(o2)>=0) {
            return o1;
        }else {
            return o2;
        }
    }


}



