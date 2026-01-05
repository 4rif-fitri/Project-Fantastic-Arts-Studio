package components;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import models.GlobalData;

public class Navbar extends JPanel {
	public Navbar(CardLayout cardLayout, JPanel cardPanel) {

		this.setVisible(true);
		this.setLayout(new BorderLayout());

		JComboBox<String> nav = new JComboBox<>();
		nav.setPreferredSize(new Dimension(960, 27));

		String[] items = { "Navbar", "HOME", "GALLARY", "CART" };
		nav.setModel(new DefaultComboBoxModel<>(items));

		this.add(nav, BorderLayout.NORTH);

		// event listener

		nav.addItemListener(e -> {

			if (e.getStateChange() == ItemEvent.SELECTED) {
				String key = (String) e.getItem();
				switch (key){
					case "CART": GlobalData.refreshCart(); break;
					case "GALLARY": GlobalData.refreshGallaryAll(); break;
				}

				cardLayout.show(cardPanel, key);
				nav.setSelectedIndex(0);
			}

		});

	}
}
