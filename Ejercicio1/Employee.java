public abstract class Employee {
    private String name;
    private int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Employee(Employee e) {
        this.name = e.getName();
        this.id = e.getId();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    

    public abstract double calculatePay();

    public void display(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee ID: " + getId());
    }
    
    
}