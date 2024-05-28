public class FullTimeEmp extends Employee {
    private int salaryPerHour;

    public FullTimeEmp(String name, int id, int salary) {
        super(name, id);
        this.salaryPerHour = salary;
    }

    
    public FullTimeEmp(FullTimeEmp f) {
        super(f.getName(),f.getId());
        this.salaryPerHour = f.getSalaryPerHour();
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    @Override
    public double calculatePay(){
        // Suponiendo que trabaja una jornada de 8 horas
        return salaryPerHour;
    }
    

    @Override
    public void display(){
        super.display();
        System.out.println("Employee Type: Full Time");
        System.out.println("Payment: " + calculatePay() + "\n");
    }
    
}
