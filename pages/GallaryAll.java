package pages;

import components.*;
import controllers.GambarController;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.*;


public class GallaryAll extends JPanel {
	public final static int GAP = 48;
	JPanel content = new JPanel();
	
	public GallaryAll(CardLayout cardLayout, JPanel cardPanel, GambarController data) {
		this.setPreferredSize(new Dimension(GlobalData.W, GlobalData.H));
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		// main container
		content.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
		content.setBackground(Color.WHITE);

		// main container ~ grid layout only 3 col n infinity row
		content.setLayout(new GridLayout(0, 3, GAP, GAP));

		for (Gambar item : GlobalData.gambarController.getAll()) {
			if (!item.isCart()) content.add(new OnePicture(item));
		}
		// bagi main container ade scroll
		JScrollPane scroll_conteiner = new JScrollPane(content);
		scroll_conteiner.getVerticalScrollBar().setUnitIncrement(20);

		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(scroll_conteiner, BorderLayout.CENTER);
		this.add(new Footer("HOME", cardLayout, cardPanel), BorderLayout.SOUTH);
		// layout setting

	}

	public void loadAll(){
		content.removeAll();
		for (Gambar item : GlobalData.gambarController.getAll()) {
			if (!item.isCart()) content.add(new OnePicture(item));
		}
	}
}
