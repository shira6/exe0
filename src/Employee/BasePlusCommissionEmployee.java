package Employee;

import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    float baseSalary;

    /**
     * initializes the Employee with the corresponding parameters
     */
    public BasePlusCommissionEmployee(String firstName, String lastName, int ID, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, ID, grossSales, commission);
        if(baseSalary < 0)
            throw new IllegalArgumentException("baseSalary can't be less then 0");
        this.baseSalary = baseSalary;
    }
    /**
     * initializes the Employee with the name "plony almony" and 0 for the number verbals
     */
    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("baseSalary can't be less then 0");
        this.baseSalary = baseSalary;
    }
    /**
     * over rides toString
     * @return the employees details in a string format
     */

    @Override
    public double earnings(){
        return baseSalary + commission/100.0*grossSales;
    }

    @Override
    public String toString() {
        return "BasePlus" + super.toString() +
                "baseSalary=" + baseSalary + '\n';
    }
    /**
     * @param o the object which "this" is compared to
     * @return true if the objects are equal and false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;
        return Float.compare(baseSalary, that.baseSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary);
    }
}
