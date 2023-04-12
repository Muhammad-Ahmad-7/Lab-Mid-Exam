package ShoppingManagementSystem;

public class Customer {
    String name;
    String email;
    ShoppingCart shoppingCart;

    public Customer(String name, String email, ShoppingCart shoppingCart) {
        this.name = name;
        this.email = email;
        this.shoppingCart = shoppingCart;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Copy Constructor
    public Customer(Customer customer){
        this.name = customer.name;
        this.email = customer.email;
        this.shoppingCart = customer.shoppingCart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }

    @Override
    public Customer clone(){
        return new Customer(this.name, this.email, this.shoppingCart);
    }
}
