package Employee;

import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int ID;

    /**
     * initializes the Employee with the name "plony almony" and 0 for the number verbals
     */
    public Employee() {
        this.firstName = "plony";
        this.lastName = "almony";
        this.ID = 0;
    }

    /**
     * initializes the Employee with the corresponding parameters
     */
    public Employee(String firstName, String lastName, int ID) {
       if (firstName.isBlank()||lastName.isBlank())
           throw new IllegalArgumentException("names can't be blank");
       if(ID < 0)
           throw new IllegalArgumentException("ID can't be less then 0");
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isBlank())
            throw new IllegalArgumentException("names can't be blank");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if (lastName.isBlank())
            throw new IllegalArgumentException("names can't be blank");
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        if(ID < 0)
            throw new IllegalArgumentException("ID can't be less then 0");
        this.ID = ID;
    }

    /**
     * @param o the object which "this" is compared to
     * @return true if the objects are equal and false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //if o is null, or is a different class, they aren't equal
        Employee employee = (Employee) o;
        return ID == employee.ID && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ID);
    }

    /**
     * over rides to string
     * @return the employees details in a string format
     */
    @Override
    public String toString() {
        return "Employee.Employee: \n" +
                "firstName = " + firstName + '\n' +
                "lastName = " + lastName + '\n' +
                "ID = " + ID + '\n';
    }

protected abstract double earnings();  //calculates the employee's salary

}
