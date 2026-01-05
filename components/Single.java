package components;

import controllers.CartController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import models.*;

public class Single extends JFrame {
	public final static int W = GlobalData.W * 8/10;
	public final static int H = GlobalData.H * 8/10;
	public final static int WGAM = W * 3/10;
	public final static int HGAM = WGAM * 6/4;
	
	public Single(Gambar item) { //get the url from img folder
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setLayout(new GridLayout(1, 2));
		this.setSize(W, H);
		this.setLocationRelativeTo(null);



		JPanel panelGambar = new JPanel();
		panelGambar.setPreferredSize(new Dimension(W * 4/10, 0));
		panelGambar.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panelGambar.setBackground(Color.decode("#b02323"));

		JButton gambar = new JButton();
		gambar.setIcon(new ImageIcon(getClass().getResource(item.getUrl())));
		//label.setText("pizza");
		gambar.setPreferredSize(new Dimension(WGAM, HGAM));
		gambar.setBorder(new LineBorder(Color.decode("#ffbf00"), 10));
		panelGambar.add(gambar);
		//this.add(label);


		//BINA PANEL DESCRIPTION====================================================================
		JPanel panelDesc = new JPanel();
		panelDesc.setLayout(new BorderLayout());

			JPanel panel1 = new JPanel();
			panel1.setLayout(new GridLayout(2, 1));
				JLabel title = new JLabel(item.getName());
				title.setFont(new Font("Ariel", Font.BOLD, 27));
				JLabel category = new JLabel(item.getCatagory());
			panel1.add(title);
			panel1.add(category);

			JPanel panel2 = new JPanel();
				//ADE DESCRIPTION PUNYE TEXT======================================================================
				JTextArea desc = new JTextArea(
					"You see, pizza usually put on a plate or a flat board. " +
					"But this..this is masterpiece. This is truly out of this " + 
					"world. No camparison. Lets add more line to do some experiments"
				);
				desc.setPreferredSize(new Dimension(W * 6/10, H));
				desc.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				//desc.setBackground(Color.decode("#eeeeee"));
				desc.setEditable(false);
				desc.setFocusable(false); // optional
				desc.setLineWrap(true);
				desc.setWrapStyleWord(true);
			panel2.add(desc);
			JPanel panel3 = new JPanel();
			panel3.setLayout(new GridLayout(1, 2));
				JLabel price = new JLabel("RM " + item.getPrice());
				JButton addToCart = new JButton("Add To Cart");
				addToCart.addActionListener(e->{
					// tambah validation sikit
					item.setCart(true);
					CartController.addToCart(item);
				});
			panel3.add(price);
			panel3.add(addToCart);


		//LETAK SEMUA BENDA KAT PANEL DESCRIPTION======================================================================
		panelDesc.add(panel1, BorderLayout.NORTH);
		panelDesc.add(panel2, BorderLayout.CENTER);
		panelDesc.add(panel3, BorderLayout.SOUTH);
		//this.add(label2);



		this.add(panelGambar, BorderLayout.WEST);
		this.add(panelDesc, BorderLayout.CENTER);
		
	}
}
