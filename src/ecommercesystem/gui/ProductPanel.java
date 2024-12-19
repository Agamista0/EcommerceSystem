package ecommercesystem.gui;

import javax.swing.*;
import ecommercesystem.model.*;
import java.util.List;

public class ProductPanel extends JPanel {
    
    public ProductPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Products:");
        add(label);

        List<Product> products = getAllProducts();
        for (Product product : products) {
            JButton productButton = new JButton(product.getDescription() + " - $" + product.getPrice());
            productButton.addActionListener(e -> CartManager.getInstance().addProduct(product));
            add(productButton);
        }
    }

    private List<Product> getAllProducts() {
        return List.of(
            ProductFactory.createProduct("Electronics", "Smartphone", "Latest model", 699.99, "/path/to/image"),
            ProductFactory.createProduct("Clothing", "T-Shirt", "Cotton T-Shirt", 19.99, "/path/to/image")
        );
    }
}