class Employee {
String name;
String department;

Employee(String name, String department) {
    this.name = name;
    this.department = department;
}

void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Department: " + department);
}

}

class Manager extends Employee {
int teamSize;
String projectName;

Manager(String name, String department, int teamSize, String projectName) {
    super(name, department);
    this.teamSize = teamSize;
    this.projectName = projectName;
}

void displayDetails() {
    super.displayDetails();
    System.out.println("Team Size: " + teamSize);
    System.out.println("Project Name: " + projectName);
}

}

public class Pr15 {
public static void main(String[] args) {
Employee e = new Employee("Rahul", "IT");
Manager m = new Manager("Neha", "Development", 10, "Project ");

    e.displayDetails();
    m.displayDetails();
}
}