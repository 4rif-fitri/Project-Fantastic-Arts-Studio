package controllers;

import java.util.ArrayList;
import models.Gambar;

public class GambarController {
	private ArrayList<Gambar> All = new ArrayList<>();
	private ArrayList<Gambar> Painting = new ArrayList<>();
	private ArrayList<Gambar> NFTArt = new ArrayList<>();
	private ArrayList<Gambar> Drawing=new ArrayList<>();
	private ArrayList<Gambar> Photography=new ArrayList<>();
	private ArrayList<Gambar> AbstractArt=new ArrayList<>();
	private ArrayList<Gambar> PopArt=new ArrayList<>();
	private ArrayList<Gambar> DigiArt=new ArrayList<>();
	private ArrayList<Gambar> TradArt=new ArrayList<>();
	private ArrayList<Gambar> Sculpture=new ArrayList<>();


	

	public GambarController() {
		// Init static data
		All.add(new Gambar(4, "Lacquer Vat", "../img/pnt/_japan_lacquer_dipping_vat_1947.1.27.jpg", "Hokusai School", "Painting", 5000.0));
		All.add(new Gambar(5, "Cigar Store Indian", "../img/pnt/cigar_store_indian_1943.8.10087.jpg", "Vintage Anon", "Painting", 300.0));
		All.add(new Gambar(6, "Rustic Cupboard", "../img/pnt/cupboard_1943.8.7897.jpg", "Carpenter Joe", "Painting", 450.0));
		All.add(new Gambar(7, "Antique Jug", "../img/pnt/jug_1943.8.7380.jpg", "Potter Harry", "Painting", 80.0));

		All.add(new Gambar(15, "Urban Shadows", "../img/pht/pexels-daniel-miller-2106839-35064002.jpg", "Daniel Miller", "Photography", 350.0));
		All.add(new Gambar(16, "Mountain Peak", "../img/pht/pexels-eberhardgross-35229930.jpg", "Eberhard Gross", "Photography", 420.0));
		All.add(new Gambar(17, "City Lights", "../img/pht/pexels-eva-hamitaj-181569841-16059523.jpg", "Eva Hamitaj", "Photography", 299.99));
		All.add(new Gambar(18, "Desert Dunes", "../img/pht/pexels-joseph-hamdy-2158299402-35288906.jpg", "Joseph Hamdy", "Photography", 550.0));

		All.add(new Gambar(24, "Cyber Punk", "../img/nft/2022-09-13-07_40_55-nft-1.jpg-_-Photos.png", "Satoshi", "NFT Art", 1200.50));
		All.add(new Gambar(25, "Ether Rock", "../img/nft/a94e2d09-2f19-4bd2-a13f-6d6eff58684c_eadcc3b5.jpg", "Vitalik", "NFT Art", 8500.00));
		All.add(new Gambar(26, "Digital Soul", "../img/nft/d2caafb1-70da-47e2-ba48-efd66565cde1_w1024_r0.9975262832405689_fpx44.98_fpy48.86.jpg", "Beeple", "NFT Art", 450.75));
		All.add(new Gambar(27, "Metaverse One", "../img/nft/imnjuyages.jpg", "Pak", "NFT Art", 3200.00));

		All.add(new Gambar(33, "Indian Tradition", "../img/tda/1625408413053_PitashreeArts_IndianTraditionalWomanArt__48930.jpg", "Pitashree Arts", "Traditional Art", 1200.0));
		All.add(new Gambar(34, "Vintage Pattern", "../img/tda/6f1822_68501e398a834591b23c295fda2c7d97~mv2.jpg", "Unknown Master", "Traditional Art", 800.50));
		All.add(new Gambar(35, "Chinese Essence", "../img/tda/brushing-the-essence-of-traditional-chinese-artworks-image-6.jpg", "Li Wei", "Traditional Art", 2500.0));
		All.add(new Gambar(36, "Classic Texture", "../img/tda/downjyjyjgload.jpg", "Artisana", "Traditional Art", 450.0));

		All.add(new Gambar(39, "Comic Blast", "../img/ppa/1000_F_123220419_894z69WIi8QtPx3NiFD2iQ1xm5fXtwps.jpg", "Roy L.", "Pop Art", 150.0));
		All.add(new Gambar(40, "Retro Collage", "../img/ppa/66859287af4d280155f9e8ec_HistriadoPopArtPopArteoPhotoshop_Prancheta1_2614fe1ba55ce39c27afd82e22e0a876_2000.png", "Digital Pop", "Pop Art", 200.0));
		All.add(new Gambar(41, "Orange Marilyn", "../img/ppa/andy-warhol-shot-orange-marilyn.jpg", "Andy Warhol", "Pop Art", 50000.0));

		All.add(new Gambar(45, "Chaotic Swirls", "../img/abt/571290380a1280329d41625dea13b158.jpg", "Abstractor", "Abstract Art", 400.0));
		All.add(new Gambar(46, "Blue Abstract", "../img/abt/8498499-VSMDQQZN-7.jpg", "Blue Mood", "Abstract Art", 350.0));
		All.add(new Gambar(47, "Canvas Dreams", "../img/abt/abstract-art-on-canvas-2.jpg", "Canvas King", "Abstract Art", 600.0));
		All.add(new Gambar(48, "Style Fusion", "../img/abt/abstract-art-styles-1.jpg", "Fusionist", "Abstract Art", 550.0));

		All.add(new Gambar(54, "Owl Ink", "../img/drw/10-how-to-draw-an-owl-ink-completing-the-artwork.jpg", "Ink Master", "Drawing", 100.0));
		All.add(new Gambar(55, "Graphite Portrait", "../img/drw/Agnes-Grochulska-graphite-portrait-drawing-18.jpg", "Agnes G.", "Drawing", 800.0));
		All.add(new Gambar(56, "Rose Sketch", "../img/drw/completed-rose-drawing-1024x865.jpg", "Rose Artist", "Drawing", 150.0));
		All.add(new Gambar(57, "Fundamental Lines", "../img/drw/Drawing-Fundamentals-header.jpg", "Teacher Draw", "Drawing", 120.0));

		All.add(new Gambar(63, "Digital Hero", "../img/dga/1283065.jpg", "Heroic Pixel", "Digital Art", 300.0));
		All.add(new Gambar(64, "Ashcan Hero", "../img/dga/ashcan-digital-hero-36-a01-1000h-2019-08.jpg", "Ashcan", "Digital Art", 400.0));
		All.add(new Gambar(65, "Boxshot Art", "../img/dga/Georg_Ireland_Boxshot_Artwork-1024x788.jpg", "Georg Ireland", "Digital Art", 500.0));
		All.add(new Gambar(66, "Abstract Digital", "../img/dga/gert54r3et.jpg", "Gert", "Digital Art", 250.0));

		All.add(new Gambar(72, "Eternal Silence", "../img/scp/61g3DeXSFmL._AC_UF894,1000_QL80_.jpg", "Stone Mason", "Sculpture", 1450.0));
		All.add(new Gambar(73, "Modern Twist", "../img/scp/grizi-1.jpg", "Artie Choke", "Sculpture", 920.50));
		All.add(new Gambar(74, "Porcelain Myth", "../img/scp/Harpy-2018-porcelain-scaled.jpg", "Clay Master", "Sculpture", 2100.0));

		filter();
	}

	public void filter() {
		for (Gambar item : All) {
			if (item.getCatagory().equals("Painting")) {
				Painting.add(item);
			} else if (item.getCatagory().equals("NFT Art")) {
				NFTArt.add(item);
			} else if (item.getCatagory().equals("Drawing")) {
                Drawing.add(item);
            } else if (item.getCatagory().equals("Photography")) {
                Photography.add(item);
            } else if (item.getCatagory().equals("Abstract Art")) {
                AbstractArt.add(item);
            } else if (item.getCatagory().equals("Pop Art")) {
                PopArt.add(item);
            } else if (item.getCatagory().equals("Digital Art")) {
                DigiArt.add(item);
            } else if (item.getCatagory().equals("Traditional Art")) {
                TradArt.add(item);
            } else if (item.getCatagory().equals("Sculpture")) {
                Sculpture.add(item);

			}

        }


	}
	

	public ArrayList<Gambar> getPainting() {
		return Painting;
	}

	public ArrayList<Gambar> getNFTArt() {
		return NFTArt;
	}

	public  ArrayList<Gambar> getAll() {
		return All;
	}

	public ArrayList<Gambar> getDrawing() {
        return Drawing;
    }

    public ArrayList<Gambar> getPhotography() {
        return Photography;
    }

    public ArrayList<Gambar> getAbstractArt() {
        return AbstractArt;
    }

    public ArrayList<Gambar> getPopArt() {
        return PopArt;
    }

    public ArrayList<Gambar> getDigiArt() {
        return DigiArt;
    }

    public ArrayList<Gambar> getTradArt() {
        return TradArt;
    }

	    public ArrayList<Gambar> getSculpture() {
        return Sculpture;
    }

	public ArrayList<Gambar> getArtByCat(String cat){
		switch (cat){
			case "Painting": return getPainting();
			case "NFT Art": return getNFTArt();
			case "Drawing": return getDrawing();
			case "Photography": return getPhotography();
			case "Abstract Art": return getAbstractArt();
			case "Pop Art": return getPopArt();
			case "Digital Art": return getDigiArt();
			case "Traditional Art": return getTradArt();
			case "Sculpture": return getSculpture();
			default: return getAll();
		}
	}
}
