package components;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NavbarCatagory extends JPanel {
	public NavbarCatagory(CardLayout cardLayout, JPanel cardPanel) {
		this.setBackground(Color.decode("#b02323"));
		
		JButton btn_all = new JButton("ALL");
		JButton btn_category = new JButton("CATEGORY");

		this.add(btn_all);
		this.add(btn_category);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		btn_all.addActionListener(e -> {
			cardLayout.show(cardPanel, "GALLARY");
		});

		btn_category.addActionListener(e -> {
			cardLayout.show(cardPanel, "CATEGORY");
		});
	}
}
