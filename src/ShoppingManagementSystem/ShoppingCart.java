package ShoppingManagementSystem;

import java.util.Arrays;

public class ShoppingCart {
    ShoppingCart shoppingCart;
    static int i = 0;

    Order items[] = new Order[4];
    public void addItems(Order order){
        items[i] = order;
        i++;
    }

    public Order[] getItems() {
        return items;
    }

    public void setItems(Order[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shoppingCart=" + shoppingCart +
                ", items=" + Arrays.toString(items) +
                '}';
    }
}
