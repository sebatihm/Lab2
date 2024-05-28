
public class Company {
    private String name;
    private Employee[] employees;
    private int numberOfEmployee;


    public Company(String name, int size) {
        this.name = name;
        this.employees = new Employee[size];
        this.numberOfEmployee = 0;
    }

    public void addEmployee(Employee employee){
        if(numberOfEmployee < employees.length){
            employees[numberOfEmployee] = employee;
            numberOfEmployee++;
        }else {
            System.out.println("The company has no vacancy");
        }

    }


    public int searchName(String name){

        for(int i = 0; i < employees.length; i++){
            if (employees[i].getName() == name){
                return i;
            }
        }

        //Regresa -1 si no encuentra el nombre solicitado
        return -1;
    }

    public void deleteEmployee(String name){
        if(this.numberOfEmployee != 0){
            int index = searchName(name);
            if (index != 1){
                employees[index] = null;
            } else {
                System.out.println("The employee does not exists");
            }
        }else{
            System.out.println("There is no employee in the company");
        }
    }


    public double getYearlyPay(String name){
        int index = searchName(name);

        if(index != -1 && employees[index] instanceof FullTimeEmp){
            return employees[index].calculatePay();
        }

        System.out.println(index == -1?"There is no employee with that name":"The employee is not a Full Time Employee");
        return -1;


    }

    public double calAvgPayForPartTime(){
        int partTimeEmployeeNumber = 0;
        double totalPay = 0;
        for (Employee employee : employees){
            if(employee instanceof PartTimeEmp){
                totalPay += employee.calculatePay();
                partTimeEmployeeNumber++;
            }
        }

        if(totalPay == 0){
            System.out.println("There is no employees with a Part Time");
            return 0;
        }

        return totalPay / partTimeEmployeeNumber;
    }



    public void displayAll(){
        System.out.println("Company name: " + name);
        System.out.println("Company actual number of employees: " + numberOfEmployee);

        System.out.println("Here are all of the employees of the Company " + this.name + "\n");
        for(Employee employee : employees){
            if(employee == null){
                continue;
            }
            employee.display();
        }
        
    }


    
}
