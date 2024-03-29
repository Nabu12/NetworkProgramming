public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public void setEmployeeAge(int age) {
        model.setAge(age);
    }

    public void setEmployeeContact(String contact) {
        model.setContact(contact);
    }

    public void setEmployeeDepartment(String department) {
        model.setDepartment(department);
    }

    public void updateView() {
        view.displayEmployeeDetails(model);
    }
}
