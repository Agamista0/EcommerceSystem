package ecommercesystem.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.border.EmptyBorder;

import ecommercesystem.model.Product;
import ecommercesystem.model.SeasonalDiscountDecorator;

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
                    MakingOfProduct frame = new MakingOfProduct(product);
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
    public MakingOfProduct(Product product) {
        this.product = product;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(20, 20, 20, 20)); 

        setContentPane(contentPane);
        contentPane.setLayout(null);
		
		JMenu discountMnu = new JMenu("Discounts");
		discountMnu.setBounds(112, 11, 115, 26);
		discountMnu.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JMenuItem selectedItem = (JMenuItem) e.getSource(); // Get the selected JMenuItem
		        String selectedItemName = selectedItem.getText(); // Get the text of the selected item

		        addDiscount(selectedItemName);
		    }
		});
		contentPane.add(discountMnu);
		
		JMenuItem seasonalDscnt = new JMenuItem("Seasonal Discount");
		discountMnu.add(seasonalDscnt);
		
		JMenuItem specialDscnt = new JMenuItem("SpecialDscnt");
		discountMnu.add(specialDscnt);
		
		JButton addBtn = new JButton("Add");
		addBtn.setBounds(112, 159, 63, 23);
		contentPane.add(addBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(204, 159, 79, 23);
		contentPane.add(cancelBtn);
	}
	
	public MakingOfProduct() {
		
	}

	private Product addDiscount(String discount) {
		switch (discount) {
	    case "SeasonalDiscount":
	        return new SeasonalDiscountDecorator(this.product);
	    case "SpecialDiscount":
	    	return new SeasonalDiscountDecorator(this.product);
	    default:
	    	return null;
	}
		
	} 
}
