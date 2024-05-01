package Employee;

import java.util.Objects;

public  class HourlyEmployee extends Employee{

    int hours;
    float wage;

    /**
     * calculates the employee's salary
     */
    @Override
    protected double earnings() {
        return hours*wage;
    }

    /**
     * initializes the Employee.Employee with the corresponding parameters
     */
    public HourlyEmployee(String firstName, String lastName, int ID, int hours, float wage) {
        super(firstName, lastName, ID);
        this.hours = hours;
        this.wage = wage;
    }

    /**
     * initializes the Employee.Employee with the name "plony almony" and 0 for the number verbals
     */
    public HourlyEmployee() {
        super();
        this.hours = 0;
        this.wage = 0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    /**
     * over rides toString
     * @return the employees details in a string format
     */
    @Override
    public String toString() {
        return "Hourly" + super.toString() +
                "hours=" + hours + '\n' +
                "wage=" + wage + '\n';
    }

    /**
     * @param o the object which "this" is compared to
     * @return true if the objects are equal and false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //if o is null, or is a different class, they aren't equal
        if (!super.equals(o)) return false;//if the inherited fields aren't equal, return false.
        HourlyEmployee that = (HourlyEmployee) o;
        return hours == that.hours && Float.compare(wage, that.wage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hours, wage);
    }
}
