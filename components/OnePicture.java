package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import models.Gambar;

public class OnePicture extends JButton {
	public OnePicture(Gambar item){
		this.setPreferredSize(new Dimension(200, 250));
		this.setIcon(new javax.swing.ImageIcon(getClass().getResource(item.getUrl())));
		this.setBorder(new LineBorder(Color.decode("#d9d9d9"), 1, true));
		this.setLayout(new BorderLayout());
		
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.decode("#d9d9d9"));
		//pnl.setBorder(new LineBorder(Color.black, 2, true));

		//JButton addToCart = new JButton("Add To Cart");
		JLabel name = new JLabel(item.getName());
		name.setForeground(Color.decode("#b02323"));
		//JLabel harga = new JLabel("RM " + item.getPrice());
		//JLabel catagory = new JLabel(item.getCatagory());

		pnl.add(name);
		// pnl.add(catagory);
		// pnl.add(harga);
		// pnl.add(addToCart);

		this.addActionListener(e->{
			new Single(item);

		});
		this.add(pnl,BorderLayout.SOUTH);
	}

		// even listerner
	// =>
	// =>
	// =>
}
