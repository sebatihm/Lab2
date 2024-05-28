public class Main {
    public static void main(String[] args) {
            Company company1 = new Company("telcel", 5);
            FullTimeEmp employee1 = new FullTimeEmp("Javier", 1, 58);
            employee1.display();

            PartTimeEmp employee2 = new PartTimeEmp("Andres", 2, 8, 8);
            employee2.display();

            PartTimeEmp employee3 = new PartTimeEmp("Jane", 3, 6, 8);

            PartTimeEmp employee4 = new PartTimeEmp("James", 3, 6, 8);

            PartTimeEmp employee5 = new PartTimeEmp("Lara", 3, 6, 8);
            
            company1.addEmployee(employee1);
            company1.addEmployee(employee2);
            company1.addEmployee(employee3);
            company1.addEmployee(employee4);
            company1.addEmployee(employee5);
            //Error esperado
            company1.addEmployee(employee3);

            company1.deleteEmployee("Jane");

            System.out.println("The average for telcel is: " + company1.calAvgPayForPartTime()+"\n\n");
            company1.displayAll();


    }
}
