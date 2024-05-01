package Employee;

public class Payroll {
    public static void main(String[] args){
        Employee[] employees = new Employee[3];
        employees[0] = new HourlyEmployee("sara","cohen",543872910,8,40);
        employees[1]= new CommissionEmployee("rachel","levi",97521867,9870,87);
        employees[2]= new BasePlusCommissionEmployee("moshe","israeli",967673452,45678,10,40);
         for(int i = 0; i<3;i++){
             System.out.println(employees[i]);
             System.out.println("salary = " + employees[i].earnings() + '\n');
         }
    }
}
