package ecommercesystem.model;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static CartManager instance;
    private List<Product> cartItems = new ArrayList<>();

    private CartManager() {}

    public static synchronized CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public List<Product> getCartItems() {
        return cartItems;
    }
}