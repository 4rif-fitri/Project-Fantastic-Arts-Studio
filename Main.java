import components.Navbar;
import controllers.CartController;
import controllers.GambarController;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import models.GlobalData;
import pages.*;

//main mian main main
public class Main {

	public JFrame frame = new JFrame();
	
	private CardLayout cardLayout = new CardLayout();
	private JPanel cardPanel = new JPanel(cardLayout);

	final static String HOME = "HOME";
	final static String GALLARY = "GALLARY";
	final static String CATEGORY = "CATEGORY";
	final static String SINGLE = "SINGLE";
	final static String CART = "CART";
	GambarController data = new GambarController();
	CartController cart = new CartController();

	public Main() {
		frame.setVisible(true);
		frame.setSize(900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GlobalData globalData = new GlobalData(cardLayout, cardPanel);
		globalData.updateAlamatOfControllers(cart, data);

		Home home = new Home();
		GallaryAll gallaryAll = new GallaryAll(cardLayout, cardPanel, data);
		Category category = new Category(globalData);
		PicturesByCategory picturesByCategory = new PicturesByCategory(data, globalData);
		CartPage cartPage = new CartPage(globalData);

		globalData.updateAlamatOfPages(category, gallaryAll, picturesByCategory);
		
						//    panel , Key
		cardPanel.add(home, HOME); // add page home
		cardPanel.add(gallaryAll, GALLARY);
		cardPanel.add(category, CATEGORY);
		cardPanel.add(picturesByCategory, SINGLE);
		cardPanel.add(cartPage, CART);

		cardLayout.show(cardPanel, HOME); //SHOW PANEL FUNC <===

		//layout setting
		frame.getContentPane().add(new Navbar(cardLayout, cardPanel), BorderLayout.NORTH);
		frame.getContentPane().add(cardPanel, BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		// layout setting

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Main();
		});
	}

}