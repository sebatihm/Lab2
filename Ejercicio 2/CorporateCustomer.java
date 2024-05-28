public class CorporateCustomer extends Customer{
    private String account;
    
    public void Pay(Order order) {
        System.out.println("The corporate customer has paid");
    }
    public CorporateCustomer(String account) {
        this.account = account;
    }
}
