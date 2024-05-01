package Employee;

import java.util.Objects;

public class CommissionEmployee extends  Employee{
    float grossSales;
    int commission;

    /**
     * initializes the Employee with the corresponding parameters
     */
    public CommissionEmployee(String firstName, String lastName, int ID, float grossSales, int commission) {
        super(firstName, lastName, ID);
        if(grossSales < 0)
            throw new IllegalArgumentException("grossSales can't be less then 0");
        if(commission < 0)
            throw new IllegalArgumentException("commission can't be less then 0");
        this.grossSales = grossSales;
        this.commission = commission;
    }
    /**
     * initializes the Employee with the name "plony almony" and 0 for the number verbals
     */
    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        if(grossSales < 0)
            throw new IllegalArgumentException("grossSales can't be less then 0");
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        if(commission < 0)
            throw new IllegalArgumentException("commission can't be less then 0");
        this.commission = commission;
    }

    /**
     * over rides toString
     * @return the employees details in a string format
     */
    @Override
    public String toString() {
        return "Commission" + super.toString() +
                "grossSales = " + grossSales + '\n'+
                "commission = " + commission + '\n';
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
        CommissionEmployee that = (CommissionEmployee) o;
        return Float.compare(grossSales, that.grossSales) == 0 && commission == that.commission;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commission);
    }

    @Override
    protected double earnings() {
        return commission/100.0*grossSales;
    }

}
