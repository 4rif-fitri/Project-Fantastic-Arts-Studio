package controllers;

import java.util.ArrayList;
import models.Gambar;

public class CartController {
	private static ArrayList<Gambar> shoppingCart = new ArrayList<>();

    public static void addToCart(Gambar item){
        shoppingCart.add(item);
        System.out.println("Received item of RM " + item.getPrice() + " at CartController");
    }
    
    public static void removeFromCart(Gambar item) {
        if (shoppingCart.remove(item)) { // remove() mengembalikan true jika item berjaya dibuang
            item.setCart(false);
            System.out.println("Removed item of RM " + item.getPrice() + " from CartController");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public static ArrayList<Gambar> getCart(){
        return shoppingCart;
    }

    public static boolean isEmpty(){
        return shoppingCart.isEmpty();
    }
}
