public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Developer", 50000));
        manager.addEmployee(new Employee(102, "Bob", "Designer", 40000));
        manager.addEmployee(new Employee(103, "Charlie", "Manager", 60000));

        System.out.println("All Employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for employee with ID 102:");
        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? found : "Not found");

        System.out.println("\nDeleting employee with ID 102:");
        manager.deleteEmployee(102);

        System.out.println("\nAll Employees after deletion:");
        manager.traverseEmployees();
    }
}
