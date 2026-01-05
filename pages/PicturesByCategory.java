package pages;

import components.Footer;
import components.NavbarCatagory;
import components.OnePicture;
import controllers.GambarController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.Gambar;
import models.GlobalData;

public class PicturesByCategory extends JPanel {
	GlobalData GD;
	JPanel content;
	GambarController data;
	JScrollPane scroll_conteiner;
	public final static int gap = 48;

	public PicturesByCategory(GambarController data, GlobalData globalData) {
		this.GD = globalData;
		this.data = data;
		this.setVisible(true);
		this.setBackground(Color.green);
		this.setLayout(new BorderLayout());

		content = new JPanel();
		// ~grid layout only 3 col n infinity row
		content.setLayout(new GridLayout(0, 3, gap, gap));
		content.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
		content.setBackground(Color.WHITE);

		// this loop akan ambil data data dari controller DATA.java base on catagory yg
		// user click

		scroll_conteiner = new JScrollPane(content);
		scroll_conteiner.getVerticalScrollBar().setUnitIncrement(20);

		// layout setting
		this.add(new NavbarCatagory(GD.cardLayout, GD.cardPanel), BorderLayout.NORTH);
		this.add(scroll_conteiner, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", GD.cardLayout, GD.cardPanel), BorderLayout.SOUTH);
		// layout setting

	}

	private void clearIni(){
		content.removeAll();
		this.add(new NavbarCatagory(GD.cardLayout, GD.cardPanel), BorderLayout.NORTH);
		this.add(scroll_conteiner, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", GD.cardLayout, GD.cardPanel), BorderLayout.SOUTH);
	}

	public void loadSelectedCategory(String selectedCat){
		clearIni();
		for (Gambar item : data.getArtByCat(selectedCat)){
			if (!item.isCart()) content.add(new OnePicture(item));
		}
		
		// if (selectedCat.equals("Painting")) {
		// 	for (Gambar item : data.getPainting()) {
		// 	content.add(new OnePicture(item));
		// 	}
		// }
		// else if(selectedCat.equals("Drawing")){
		// 	for (Gambar item : data.getDrawing()) {
		// 		content.add(new OnePicture(item));
		// 	}
		// }
		// else if(selectedCat.equals("NFT Art")){
		// 	for (Gambar item : data.getNFTArt()) {
		// 		content.add(new OnePicture(item));
		// 	}
		// }
	}
}
