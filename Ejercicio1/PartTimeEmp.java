public class PartTimeEmp extends Employee{
    private int numberOfWorkHours;
    private int rate;
    public PartTimeEmp(String name, int id, int numberOfWorkHours, int rate) {
        super(name, id);
        this.numberOfWorkHours = numberOfWorkHours;
        this.rate = rate;
    }
    public PartTimeEmp(PartTimeEmp p) {
        super(p.getName(),p.getId());
        this.numberOfWorkHours = p.getNumberOfWorkHours();
        this.rate = p.getRate();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Employee Type: PartTime");
        System.out.println("Working Hours: " + getNumberOfWorkHours());
        System.out.println("Rate: " + getRate()+ "\n");

    }

    @Override
    public double calculatePay(){
        return this.numberOfWorkHours * this.rate;
    }



    public int getNumberOfWorkHours() {
        return numberOfWorkHours;
    }
    public int getRate() {
        return rate;
    }

    

    




}
