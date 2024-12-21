package ecommercesystem.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ecommercesystem.model.Product;
import ecommercesystem.model.SeasonalDiscountDecorator;
import ecommercesystem.model.SpecialDiscountDecorator;

import javax.swing.*;

public class MakingOfProduct extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private static Product product;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MakingOfProduct frame = new MakingOfProduct();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MakingOfProduct() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20)); 

        setContentPane(contentPane);
        contentPane.setLayout(null);
		
        JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(0, 128, 255));
		panel.setBounds(0, 0, 434, 265);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JMenu discountMnu = new JMenu("Discounts");
		discountMnu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				discountMnu.doClick();
			}
		});
		discountMnu.setBounds(154, 35, 115, 26);
		discountMnu.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JMenuItem selectedItem = (JMenuItem) e.getSource(); // Get the selected JMenuItem
		        String selectedItemName = selectedItem.getText(); // Get the text of the selected item

		     // Change the menu name
		        discountMnu.setText(selectedItemName); 
		        addDiscount(selectedItemName);
		    }
		});
		
		JMenuItem seasonalDscnt = new JMenuItem("Seasonal Discount");
		discountMnu.add(seasonalDscnt);
		
		JMenuItem specialDscnt = new JMenuItem("SpecialDscnt");
		discountMnu.add(specialDscnt);
		panel.add(discountMnu);
		
		JButton addBtn = new JButton("Add");
		
		
		
		addBtn.setBounds(154, 156, 63, 23);
		panel.add(addBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(246, 156, 79, 23);
		panel.add(cancelBtn);
	}
	


	private Product addDiscount(String discount) {
		switch (discount) {
	    case "SeasonalDiscount":
	    	
	        product =  new SeasonalDiscountDecorator(product);
	        return product;
	    case "SpecialDiscount":
	    	product =  new SpecialDiscountDecorator(product);
	        return product;
	    default:
	    	return null;
	}
		
	} 
}
