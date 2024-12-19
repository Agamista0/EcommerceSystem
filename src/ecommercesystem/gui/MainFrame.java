package ecommercesystem.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame {
    public static void launchGUI() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("E-Commerce System");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            // Adding panels
            frame.add(new ProductPanel(), BorderLayout.WEST);
            frame.add(new CartPanel(), BorderLayout.CENTER);
            frame.add(new PaymentPanel(), BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
