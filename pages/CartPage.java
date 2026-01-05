package pages;


import components.*;
import controllers.CartController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.*;

public class CartPage extends JPanel {
        private GlobalData GD;
        public final static int GAP = 24;
        public final static int HBOX = 100;
        static JPanel content = new JPanel();
        static JLabel totalPrice = new JLabel();

        public CartPage(GlobalData globalData){
            this.GD = globalData;
            this.setVisible(true);
            this.setBackground(Color.BLUE);
            this.setPreferredSize(new Dimension(GD.W, GD.H));
            this.setLayout(new BorderLayout());

                
                content.setBackground(Color.white);
                content.setLayout(new GridLayout(0, 1, GAP, GAP));
                content.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
                //content.setBorder(BorderFactory.);

                    
                
                JScrollPane scroll_container = new JScrollPane(content);
                scroll_container.getVerticalScrollBar().setUnitIncrement(20);

                JPanel panelCheckOut = new JPanel();
                panelCheckOut.setBackground(Color.decode("#b02323"));
                panelCheckOut.setPreferredSize(new Dimension(GD.W, 50));
                panelCheckOut.setLayout(new FlowLayout(FlowLayout.RIGHT));
                    totalPrice.setForeground(Color.white);
                    JButton buttonCheckOut = new JButton("CheckOut");
                panelCheckOut.add(totalPrice);
                panelCheckOut.add(buttonCheckOut);

                buttonCheckOut.addActionListener(e -> {
                    StringBuilder text = new StringBuilder();
                    for (Gambar item : GlobalData.cartController.getCart()) {
                        text.append(" - ").append(item.getName()).append("\r\n");
                    }
                    text.append("\r\n").append(" - ").append("Total RM " + getCartTotal()).append("\r\n");

                    GD.sendWhatsApp(text.toString());
                });

            this.add(scroll_container, BorderLayout.CENTER);
            this.add(panelCheckOut, BorderLayout.SOUTH);
                
            
        }

    public static void loadCartPage(){
        content.removeAll();

        if (CartController.isEmpty()) {
            JPanel asd = new JPanel();
            asd.setLayout(new GridBagLayout());
            JLabel label = new JLabel("Tiada barang dalam cart");
            label.setFont(new Font("Ariel", Font.BOLD, 30));
            asd.add(label);
            content.add(asd);
        }else{   
            for (Gambar item : CartController.getCart()) {
                content.add(new CartBox(item));
            }
        }
        totalPrice.setText("RM " + getCartTotal());
        content.validate();
        content.repaint();
    }
    
    private static double getCartTotal(){
        double total = 0;
        for (Gambar item : CartController.getCart()) {
            total += item.getPrice();
		}
        return total;
    }
}
