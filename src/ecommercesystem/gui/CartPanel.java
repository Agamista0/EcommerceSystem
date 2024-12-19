package ecommercesystem.gui;

import javax.swing.*;
import ecommercesystem.model.*;
import java.awt.*;
import java.util.List;
import ecommercesystem.Strategy.*; 

public class CartPanel extends JPanel {
    private JTextArea cartDisplay;

    public CartPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);
        JLabel label = new JLabel("Cart:");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        add(label, BorderLayout.NORTH);

        cartDisplay = new JTextArea();
        cartDisplay.setEditable(false);
        add(new JScrollPane(cartDisplay), BorderLayout.CENTER);

        JButton refreshButton = new JButton("Refresh Cart");
        refreshButton.addActionListener(e -> updateCartDisplay());
        add(refreshButton, BorderLayout.SOUTH);

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(e -> processPayment());
        add(payButton, BorderLayout.SOUTH);
    }

    private void updateCartDisplay() {
        List<Product> cartItems = CartManager.getInstance().getCartItems();
        cartDisplay.setText("");
        for (Product product : cartItems) {
            cartDisplay.append(product.getName() + " - $" + product.getPrice() + "\n");
        }
    }

    private void processPayment() {
        // Assuming you have a method to select payment strategy
        PaymentStrategy strategy = selectPaymentStrategy(); // New method to select payment strategy
        double totalAmount = CartManager.getInstance().getCartItems().stream().mapToDouble(Product::getPrice).sum();
        strategy.pay(totalAmount);
    }

    private PaymentStrategy selectPaymentStrategy() {
        // Logic to select payment strategy (e.g., show dialog to choose between Credit Card and PayPal)
        return new PayPalPayment(); // Example: default to PayPal
    }
}