public class Main {
    public static void main(String[] args) {
        // Create an instance of the Employee model
        Employee employee = new Employee(1, "John Doe", 30, "john.doe@example.com", "HR");

        // Create an instance of the EmployeeView
        EmployeeView view = new EmployeeView();

        // Create an instance of the EmployeeController and associate it with the model and view
        EmployeeController controller = new EmployeeController(employee, view);

        // Update the employee details
        controller.setEmployeeName("Jane Smith");
        controller.setEmployeeAge(35);
        controller.setEmployeeContact("jane.smith@example.com");
        controller.setEmployeeDepartment("Finance");

        // Update the view
        controller.updateView();
    }
}
