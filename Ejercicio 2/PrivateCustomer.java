public class PrivateCustomer extends Customer {
    private String card;
    
    public PrivateCustomer(String card){
        this.card = card;
    }
    public void Pay(Order order) {
        System.out.println("The private customer has paid");
    }

}
