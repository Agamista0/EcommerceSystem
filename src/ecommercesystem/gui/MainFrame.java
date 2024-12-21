package ecommercesystem.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void launchGUI() {
        SwingUtilities.invokeLater(() -> {
            // Create the main JFrame
            JFrame frame = new JFrame("E-Commerce System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            // Create an instance of MakingOfProduct (assuming it extends JFrame)
            MakingOfProduct productFrame = new MakingOfProduct();
            productFrame.setSize(400, 300); // Adjust size as needed
            productFrame.setLocationRelativeTo(null); // Center the product frame

            // Add panels to the main frame
            frame.add(new ProductPanel(), BorderLayout.WEST);
            frame.add(new CartPanel(), BorderLayout.CENTER);
            frame.add(new PaymentPanel(), BorderLayout.SOUTH);

            // Make both frames visible
            frame.setVisible(true);
            productFrame.setVisible(true);
        });
    }
}
