package components;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Footer extends JPanel {
	public Footer(String location, CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.decode("#b02323"));
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btn_back = new JButton("BACK");
		this.add(btn_back);

		JButton btn_cart = new JButton("Cart");
		this.add(btn_cart);

		btn_back.addActionListener(e -> {
			cardLayout.show(cardPanel, location);
		});

		btn_cart.addActionListener(e -> {
			// cardLayout.show(cardPanel, location);
		});

	}
}
