package Employee;

import java.util.Objects;

public class CommissionEmployee extends  Employee{
    float grossSales;
    int commission;

    public float getGrossSales() {
        return grossSales;
    }
    /**
     * initializes the Employee.Employee with the corresponding parameters
     */
    public CommissionEmployee(String firstName, String lastName, int ID, float grossSales, int commission) {
        super(firstName, lastName, ID);
        this.grossSales = grossSales;
        this.commission = commission;
    }
    /**
     * initializes the Employee.Employee with the name "plony almony" and 0 for the number verbals
     */
    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commission = 0;
    }

    @Override
    protected double earnings() {
        return commission/100.0*grossSales;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Commission" + super.toString() +
                "grossSales = " + grossSales + '\n'+
                "commission = " + commission + '\n';
    }

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
}
