package ecommercesystem.gui;

import javax.swing.*;
import ecommercesystem.model.*;
import ecommercesystem.Strategy.*;
import java.awt.FlowLayout;


public class PaymentPanel extends JPanel {
    public PaymentPanel() {
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Select Payment Method:");
        add(label);

        JButton creditCardButton = new JButton("Credit Card");
        creditCardButton.addActionListener(e -> processPayment(new CreditCardPayment()));
        add(creditCardButton);

        JButton paypalButton = new JButton("PayPal");
        paypalButton.addActionListener(e -> processPayment(new PayPalPayment()));
        add(paypalButton);
    }

    private void processPayment(PaymentStrategy strategy) {
        double totalAmount = CartManager.getInstance().getCartItems().stream().mapToDouble(Product::getPrice).sum();
        strategy.pay(totalAmount);
    }
}