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
		// All.add(new Gambar(8, "Roll-Top Desk", "../img/pnt/roll-top_desk_1943.8.7878.jpg", "Woody Allen", "Painting", 1200.0));
		// All.add(new Gambar(9, "Self Reflection", "../img/pnt/self-portrait_1998.74.5.jpg", "Van Goghish", "Painting", 10000.0));
		// All.add(new Gambar(10, "House of Reps", "../img/pnt/the_house_of_representatives_2014.79.27.jpg", "Samuel Morse", "Painting", 25000.0));
		// All.add(new Gambar(11, "Woman with Parasol", "../img/pnt/woman_with_a_parasol_-_madame_monet_and_her_son_1983.1.29.jpg", "Claude Monet", "Painting", 45000.0));
		All.add(new Gambar(15, "Urban Shadows", "../img/pht/pexels-daniel-miller-2106839-35064002.jpg", "Daniel Miller", "Photography", 350.0));
		All.add(new Gambar(16, "Mountain Peak", "../img/pht/pexels-eberhardgross-35229930.jpg", "Eberhard Gross", "Photography", 420.0));
		All.add(new Gambar(17, "City Lights", "../img/pht/pexels-eva-hamitaj-181569841-16059523.jpg", "Eva Hamitaj", "Photography", 299.99));
		All.add(new Gambar(18, "Desert Dunes", "../img/pht/pexels-joseph-hamdy-2158299402-35288906.jpg", "Joseph Hamdy", "Photography", 550.0));
		// All.add(new Gambar(19, "Neon Nights", "../img/pht/pexels-misa-s-60335324-28839480.jpg", "Misa S.", "Photography", 310.50));
		// All.add(new Gambar(20, "Forest Trail", "../img/pht/pexels-simon73-30372194.jpg", "Simon", "Photography", 275.0));
		// All.add(new Gambar(21, "Winter Chill", "../img/pht/pexels-sylwester-ficek-154797634-18478307.jpg", "Sylwester Ficek", "Photography", 380.0));
		// All.add(new Gambar(22, "Abstract Geometry", "../img/pht/pexels-urtimud-89-76108288-35116876.jpg", "Urtimud", "Photography", 400.0));
		// All.add(new Gambar(23, "Street Vibes", "../img/pht/pexels-yenderfonseca-35025884.jpg", "Yender Fonseca", "Photography", 330.0));
		All.add(new Gambar(24, "Cyber Punk", "../img/nft/2022-09-13-07_40_55-nft-1.jpg-_-Photos.png", "Satoshi", "NFT Art", 1200.50));
		All.add(new Gambar(25, "Ether Rock", "../img/nft/a94e2d09-2f19-4bd2-a13f-6d6eff58684c_eadcc3b5.jpg", "Vitalik", "NFT Art", 8500.00));
		All.add(new Gambar(26, "Digital Soul", "../img/nft/d2caafb1-70da-47e2-ba48-efd66565cde1_w1024_r0.9975262832405689_fpx44.98_fpy48.86.jpg", "Beeple", "NFT Art", 450.75));
		All.add(new Gambar(27, "Metaverse One", "../img/nft/imnjuyages.jpg", "Pak", "NFT Art", 3200.00));
		// All.add(new Gambar(28, "Crypto Wizard", "../img/nft/merlin_184196631_939fb22d-b909-4205-99d9-b464fb961d32-superJumbo.jpg", "XCOPY", "NFT Art", 1500.25));
		// All.add(new Gambar(29, "Glitch Face", "../img/nft/N mjyFT.jpg", "Hackatao", "NFT Art", 999.99));
		// All.add(new Gambar(30, "Bored Ape", "../img/nft/nft-bored-ape-yacht-club.jpg", "Yuga Labs", "NFT Art", 50000.00));
		// All.add(new Gambar(31, "Pixel Warrior", "../img/nft/photo_2022-02-28_00-35-30-1024x1024.jpg", "Larva Labs", "NFT Art", 2750.00));
		// All.add(new Gambar(32, "Future Vision", "../img/nft/photo_2022-02-28_00-36-20-1024x1024.jpg", "Fewocious", "NFT Art", 1100.00));	
		All.add(new Gambar(33, "Indian Tradition", "../img/tda/1625408413053_PitashreeArts_IndianTraditionalWomanArt__48930.jpg", "Pitashree Arts", "Traditional Art", 1200.0));
		All.add(new Gambar(34, "Vintage Pattern", "../img/tda/6f1822_68501e398a834591b23c295fda2c7d97~mv2.jpg", "Unknown Master", "Traditional Art", 800.50));
		All.add(new Gambar(35, "Chinese Essence", "../img/tda/brushing-the-essence-of-traditional-chinese-artworks-image-6.jpg", "Li Wei", "Traditional Art", 2500.0));
		All.add(new Gambar(36, "Classic Texture", "../img/tda/downjyjyjgload.jpg", "Artisana", "Traditional Art", 450.0));
		// All.add(new Gambar(37, "Bird Motifs", "../img/tda/human-figure-motifs-animal-figures-border-birds.jpg", "Tribal Works", "Traditional Art", 600.0));
		// All.add(new Gambar(38, "Heritage Image", "../img/tda/imayjtyges.jpg", "Old Soul", "Traditional Art", 300.0));
		All.add(new Gambar(39, "Comic Blast", "../img/ppa/1000_F_123220419_894z69WIi8QtPx3NiFD2iQ1xm5fXtwps.jpg", "Roy L.", "Pop Art", 150.0));
		All.add(new Gambar(40, "Retro Collage", "../img/ppa/66859287af4d280155f9e8ec_HistriadoPopArtPopArteoPhotoshop_Prancheta1_2614fe1ba55ce39c27afd82e22e0a876_2000.png", "Digital Pop", "Pop Art", 200.0));
		All.add(new Gambar(41, "Orange Marilyn", "../img/ppa/andy-warhol-shot-orange-marilyn.jpg", "Andy Warhol", "Pop Art", 50000.0));
		// All.add(new Gambar(42, "RGB Split", "../img/ppa/itrgbdemage1.jpg", "Colorist", "Pop Art", 350.0));
		// All.add(new Gambar(43, "Morning Graphic", "../img/ppa/Kurt_Heppke_-_Pop_Art_Portrait_half-body_Colorful_graphic_Morning_in_the_style_of_Andy_Warhol_-_(MeisterDrucke-1469308).jpg", "Kurt Heppke", "Pop Art", 1200.0));
		// All.add(new Gambar(44, "Cubism Pop", "../img/ppa/PopArtCubism_COVDriIllustre_1400x700-1024x512.jpg", "Modernist", "Pop Art", 850.0));
		All.add(new Gambar(45, "Chaotic Swirls", "../img/abt/571290380a1280329d41625dea13b158.jpg", "Abstractor", "Abstract Art", 400.0));
		All.add(new Gambar(46, "Blue Abstract", "../img/abt/8498499-VSMDQQZN-7.jpg", "Blue Mood", "Abstract Art", 350.0));
		All.add(new Gambar(47, "Canvas Dreams", "../img/abt/abstract-art-on-canvas-2.jpg", "Canvas King", "Abstract Art", 600.0));
		All.add(new Gambar(48, "Style Fusion", "../img/abt/abstract-art-styles-1.jpg", "Fusionist", "Abstract Art", 550.0));
		// All.add(new Gambar(49, "Color Splash", "../img/abt/il_NxN.5190791597_95pk.jpg", "Splasher", "Abstract Art", 300.0));
		// All.add(new Gambar(50, "Dark Matter", "../img/abt/im866956.jpg", "Dark Arts", "Abstract Art", 450.0));
		// All.add(new Gambar(51, "Vertical Flow", "../img/abt/IMG_6117-2-997x1030.jpg", "Flow Master", "Abstract Art", 500.0));
		// All.add(new Gambar(52, "Original Chaos", "../img/abt/original_49f43f62-15af-4444-95a8-4190aeaf8979.jpg", "Originator", "Abstract Art", 700.0));
		// All.add(new Gambar(53, "Downscaled Print", "../img/abt/prints_downscaled_p_hapen6kjuma_2000x2000__98018.jpg", "Printer Pro", "Abstract Art", 250.0));
		All.add(new Gambar(54, "Owl Ink", "../img/drw/10-how-to-draw-an-owl-ink-completing-the-artwork.jpg", "Ink Master", "Drawing", 100.0));
		All.add(new Gambar(55, "Graphite Portrait", "../img/drw/Agnes-Grochulska-graphite-portrait-drawing-18.jpg", "Agnes G.", "Drawing", 800.0));
		All.add(new Gambar(56, "Rose Sketch", "../img/drw/completed-rose-drawing-1024x865.jpg", "Rose Artist", "Drawing", 150.0));
		All.add(new Gambar(57, "Fundamental Lines", "../img/drw/Drawing-Fundamentals-header.jpg", "Teacher Draw", "Drawing", 120.0));
		// All.add(new Gambar(58, "Bird Step", "../img/drw/How-to-draw-a-bird-Step-19-6c36210.jpg", "Step By Step", "Drawing", 90.0));
		// All.add(new Gambar(59, "Pumpkin Sketch", "../img/drw/how-to-draw-a-pumpkin-5e334d6.jpg", "Halloween Art", "Drawing", 80.0));
		// All.add(new Gambar(60, "Hand Study", "../img/drw/how-to-draw-hands-Agnes-Grochulska-3.jpg", "Anatomy Pro", "Drawing", 200.0));
		// All.add(new Gambar(61, "Swan Graphite", "../img/drw/lee-hammond_Swan_graphite-pencil-drawing-e1551989792469-1024x756.jpg", "Lee Hammond", "Drawing", 350.0));
		// All.add(new Gambar(62, "Space Explorer", "../img/drw/space-explorer-drawing-ideas.jpg", "SciFi Drawer", "Drawing", 180.0));
		All.add(new Gambar(63, "Digital Hero", "../img/dga/1283065.jpg", "Heroic Pixel", "Digital Art", 300.0));
		All.add(new Gambar(64, "Ashcan Hero", "../img/dga/ashcan-digital-hero-36-a01-1000h-2019-08.jpg", "Ashcan", "Digital Art", 400.0));
		All.add(new Gambar(65, "Boxshot Art", "../img/dga/Georg_Ireland_Boxshot_Artwork-1024x788.jpg", "Georg Ireland", "Digital Art", 500.0));
		All.add(new Gambar(66, "Abstract Digital", "../img/dga/gert54r3et.jpg", "Gert", "Digital Art", 250.0));
		// All.add(new Gambar(67, "Wide Horizon", "../img/dga/GfGY9RURQV6xaWGXyu6bQX-1920-80.jpg", "Wide Screen", "Digital Art", 600.0));
		// All.add(new Gambar(68, "Lyanna", "../img/dga/mintautas-sukys-lyanna.jpg", "Mintautas S.", "Digital Art", 700.0));
		// All.add(new Gambar(69, "Stag & Wolf", "../img/dga/mintautas-sukys-stag-and-direwolf.jpg", "Mintautas S.", "Digital Art", 750.0));
		// All.add(new Gambar(70, "Future City", "../img/dga/V9mhxs7dovfyY8WXTCUQdJ.jpg", "City Scaper", "Digital Art", 450.0));
		// All.add(new Gambar(71, "Victoria Sphere", "../img/dga/victoria-3-sphere-of-influence-key-art.jpg", "Paradox", "Digital Art", 900.0));
		All.add(new Gambar(72, "Eternal Silence", "../img/scp/61g3DeXSFmL._AC_UF894,1000_QL80_.jpg", "Stone Mason", "Sculpture", 1450.0));
		All.add(new Gambar(73, "Modern Twist", "../img/scp/grizi-1.jpg", "Artie Choke", "Sculpture", 920.50));
		All.add(new Gambar(74, "Porcelain Myth", "../img/scp/Harpy-2018-porcelain-scaled.jpg", "Clay Master", "Sculpture", 2100.0));
		// All.add(new Gambar(75, "Golden Figure", "../img/scp/s-l1200.jpg", "Gilty Pleasure", "Sculpture", 1150.75));
		// ....
		// ....
		// ....

		// Init static data

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
