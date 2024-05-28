public abstract class Customer {
    private String name;
    
    protected abstract void Pay(Order order);

    public void Customer(String name) {
        this.name = name;
    }
}