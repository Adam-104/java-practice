package oops.encapsulation;

public class DriverClass {
    public static void main(String[] args) {
        ModelClass modelClass = new ModelClass();

        modelClass.setId(1);
        modelClass.setName("akon");
        modelClass.setSalary(10000);
        modelClass.setPassword("password");

        System.out.println(modelClass.getId());
        System.out.println(modelClass.getName());
        System.out.println(modelClass.getSalary());
        System.out.println(modelClass.getPassword());
    }
}
