class EmployeeView {
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Contact: " + employee.getContact());
        System.out.println("Department: " + employee.getDepartment());
    }
}
