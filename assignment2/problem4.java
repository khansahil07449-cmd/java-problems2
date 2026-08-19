import java.io.*;
abstract class Employee { 
 protected int  employeeId ; 
 protected String  employeeName ;
 protected double basicSalary;
 public Employee(int employeeId, String employeeName, double  basicSalary) { 
    this.employeeId = employeeId; 
    this.basicSalary = basicSalary; 
    this.employeeName = employeeName ; 

 }
 abstract double calculateSalary() ; 
public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
}
}

class  PermanentEmployee extends Employee { 
  public PermanentEmployee(  int employeeId, String employeeName, double basicSalary ){
  super(employeeId, employeeName, basicSalary);
  }

  @Override
  double calculateSalary() {
   double hra = 0.20 * basicSalary;
        double da = 0.40 * basicSalary;
        double pf = 0.12 * basicSalary;
        
        double grossSalary = basicSalary + hra + da;
        double netSalary = grossSalary - pf;
        
        return netSalary;
    }
}
 
    class ContractEmployee extends Employee {

    public ContractEmployee(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    } 
    @Override 
    double calculateSalary() {
        double allowance = 0.10 * basicSalary;
        double grossSalary = basicSalary + allowance;
        
        return grossSalary;
    }
}
public class problem4 {
    public static void main (String args[]) throws IOException { 
        
Employee e;

        e = new PermanentEmployee(101, "Aarav ", 50000.0);
        System.out.println(" Permanent Employee Details");
        e.displayInfo();
        System.out.println("Calculated Salary: " + e.calculateSalary());
        System.out.println();

        e = new ContractEmployee(102, "vishu ", 30000.0);
        System.out.println(" Contract Employee Details ");
        e.displayInfo();
        System.out.println("Calculated Salary: " + e.calculateSalary());
    }
}
