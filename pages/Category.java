package pages;

import components.Footer;
import components.NavbarCatagory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import models.GlobalData;

public class Category extends JPanel implements ActionListener{
	private GlobalData GD;
	private String[] buttonNames = {"Painting", "Drawing", "Sculpture", "Digital Art", "Photography", "Abstract Art", "Traditional Art", "NFT Art", "Pop Art"};

	public Category(GlobalData globalData) {
		this.GD = globalData;
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3, 3, 20, 20));
		content.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		//buat loop plss n bile user click btn akan ade data kategory apa dihantar ke ByCatagory.java tuk loop data
		// for loop alhamdulillah
		for (String buttonName : buttonNames){
			JButton btnNew = new JButton(buttonName);
			btnNew.addActionListener(this);
			content.add(btnNew);
		}
		

		// layout setting
		this.add(new NavbarCatagory(GD.cardLayout, GD.cardPanel), BorderLayout.NORTH);
		this.add(content, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", GD.cardLayout, GD.cardPanel), BorderLayout.SOUTH);
		// layout setting
	}

	@Override
	public void actionPerformed(ActionEvent e){
		GD.sendSelectedCategory(e.getActionCommand());
		GD.cardLayout.show(GD.cardPanel, "SINGLE");
	}
}
