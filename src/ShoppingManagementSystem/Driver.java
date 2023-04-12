package ShoppingManagementSystem;

public class Driver {
    public static void main(String[] args) {
        Electronic laptop = new Electronic(1,"Dell Inspiorn",75000,"Dell",12);
        Clothing shirt = new Clothing(2,"Cotton Shirt",2000,"L","Cotton");
        Book novel = new Book(3,"Best Novel",800,"Mohsin Hamid","Urdu Books");
        Clothing pant = new Clothing(2,"Cotton Pants",7000,"L","Cotton");


        Order order1 = new Order(laptop,1);
        Order order2 = new Order(shirt, 2);
        Order order3 = new Order(novel,1);
        Order order4 = new Order(pant, 4);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItems(order1);
        shoppingCart.addItems(order2);
        shoppingCart.addItems(order3);
        shoppingCart.addItems(order4);

        Customer customer = new Customer("Ali","ali@gmail.com");
        customer.setShoppingCart(shoppingCart);

        System.out.println("Customer: "+customer.getName());
        System.out.println("Email: "+customer.getEmail());
        System.out.println("Shopping Cart Items: ");
        for (Order order: customer.getShoppingCart().getItems()){
            System.out.println("Product: "+order.getProduct().getName()+", Qunatity: "+ order.getQuantity());
        }



    }
}
