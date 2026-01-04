package models;
import controllers.CartController;
import controllers.GambarController;
import java.awt.CardLayout;
import javax.swing.JPanel;
import pages.*;

public class GlobalData {
    public final static int W = 960;
    public final static int H = 540;
    
    public static CartController cartController;
    public static GambarController gambarController;
    public static CartPage cartPage;
    public static Category category;
    public static GallaryAll gallaryAll;
    public static Home home;
    public static PicturesByCategory picturesByCategory;
    public CardLayout cardLayout;
    public JPanel cardPanel;
    
    public String[] categories = {"Painting", "Drawing", "Sculpture", "Digital Art", "Photography", "Abstract Art", "Traditional Art", "NFT Art", "Pop Art"};

    public GlobalData(CardLayout cardLayout, JPanel cardPanel){
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
    }

    public void updateAlamatOfControllers(CartController cartCont, GambarController gambarCont){
        cartController = cartCont;
        gambarController = gambarCont;
    }
    public void updateAlamatOfPages(Category category, GallaryAll all, PicturesByCategory byCategroy){
        this.category = category;
        this.picturesByCategory = byCategroy;
        this.gallaryAll = all;
    }

    public void sendSelectedCategory(String selectedCategory){
        picturesByCategory.loadSelectedCategory(selectedCategory);
    }

    public static void sendToCart(Gambar gambar){
        CartController.addToCart(gambar);
    }

    public static void removeFromCart(Gambar gambar) {
        CartController.removeFromCart(gambar);
    }

    public static void refreshCart(){
        CartPage.loadCartPage();
    }

    public static void refreshGallaryAll(){
        gallaryAll.loadAll();
    }
}
