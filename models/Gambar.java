package models;
public class Gambar  {
	private int id;
	private double price;
	private String name;
	private String url;
	private String catagory;
	private String artisName;
	private boolean isCart = false;

	public Gambar(int id,String name, String url, String artisName, String catagory, double price){
		this.name = name;
		this.url = url;
		this.artisName = artisName;
		this.catagory = catagory;
		this.price = price;
		this.id = id;
	}
	
	public String getCatagory() {
		return catagory;
	}

    public String getArtisName() {
        return artisName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

	public String getUrl() {
		return url;
	}

	public boolean isCart() {
		return isCart;
	}
	
	public void setCart(boolean b) {
		isCart = b;
	}
}
