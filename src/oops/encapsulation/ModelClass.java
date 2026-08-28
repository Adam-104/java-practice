package oops.encapsulation;

public class ModelClass {
    private int id;
    private String name;
    private double salary;
    private String password;

    public ModelClass() {}

    public ModelClass(int id, String name, double salary, String password) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public void setPassword(String password) {
        if(password.length() < 6) {
            return;
        }
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
