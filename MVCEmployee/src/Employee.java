public class Employee {
    private int id;
    private String name;
    private int age;
    private String contact;
    private String department;

    public Employee(int id, String name, int age, String contact, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.department = department;
    }
    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
