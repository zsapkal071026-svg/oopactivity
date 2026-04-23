import java.util.*;
class employee{
    private String employeeName;
    private double employeeSalary;

public void reademployeeData(){
Scanner s = new Scanner(System.in);
System.out.println("Enter employee name");
employeeName = s.nextLine();
System.out.println("Enter employee Salary");
employeeSalary = s.nextDouble();
}
public void displayEmployeeData(){
    System.out.println("Enter employee name =" + employeeName);
    System.out.println("Enter employee salary = " + employeeSalary);
}
}
public class Pr7 {
    public static void main(String[] args) {
        employee emp  = new employee();
        emp.reademployeeData();
        emp.displayEmployeeData();
    }
    
}
