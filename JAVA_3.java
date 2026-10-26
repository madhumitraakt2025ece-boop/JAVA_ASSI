public class Employee {
    // Declare instance variables
    int employeeId;
    String name;
    double salary;
    
    // Declare static variable to track the total number of employees
    static int employeeCount = 0;
    
    // Constructor that initializes employeeId, name, and salary
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        // Increment employeeCount every time an object is created
        employeeCount++;
    }
    
    // Method to display individual employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println(); // Blank line to match the sample output format
    }
    
    // Static method to display the total number of employees
    public static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
    
    // Main method
    public static void main(String[] args) {
        // Create three employee objects
        Employee emp1 = new Employee(101, "Alice", 50000.0);
        Employee emp2 = new Employee(102, "Bob", 60000.0);
        Employee emp3 = new Employee(103, "Charlie", 55000.0);
        
        // Display the details of each employee
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
        
        // Display the total employee count
        Employee.displayEmployeeCount();
    }
}