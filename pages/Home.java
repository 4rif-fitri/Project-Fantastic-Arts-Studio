package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Home extends JPanel {

	public Home() {
		this.setVisible(true);
		this.setBackground(Color.yellow);
		this.setLayout(new BorderLayout());

		//dua main container
		JPanel kiri = new JPanel();
		JPanel kanan = new JPanel();

		//design ni
		kiri.setBackground(Color.WHITE);
		kanan.setBackground(Color.decode("#b02323"));
		

		//panel dalam container yg center
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.WHITE);
		panelCenter.setPreferredSize(new Dimension(300, 300));

		// panel dalam container yg center
		JPanel panelCenter2 = new JPanel();
		panelCenter2.setLayout(new FlowLayout());
		panelCenter2.setBackground(Color.decode("#d9d9d9"));
		panelCenter2.setPreferredSize(new Dimension(448, 360));
		panelCenter2.setBorder(BorderFactory.createLineBorder(Color.decode("#b02323"), 10));

		// pic dlm panel center kanan
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(getClass().getResource("../img/homepageArt.png")));
		//label.setPreferredSize(new Dimension(300, 300));
		// label.setText("");
		panelCenter.add(label);
		
		//Text dlm panel center kiri
		JLabel label2 = new JLabel("Fantastic 5 Studio", SwingConstants.CENTER);
		label2.setFont(new Font("Ariel", Font.BOLD, 27));
		label2.setPreferredSize(new Dimension(448, 30));
		JTextArea label3 = new JTextArea(
			"We are a creative space dedicated to painting, illustration, " +
			"and experimental visual art. Our studio is a place where ideas " +
			"come to life through color, form, and imagination.\n\n" +
			"Whether you are a beginner or a professional artist, " +
			"you are welcome to explore, learn, and create with us."
		);
		label3.setPreferredSize(new Dimension(300, 250));
		label3.setBackground(Color.decode("#d9d9d9"));
		label3.setEditable(false);
		label3.setFocusable(false); // optional
		label3.setLineWrap(true);
		label3.setWrapStyleWord(true);

		
		//add text n pic to panel
		panelCenter2.add(label2);
		panelCenter2.add(label3);


		//Center panel
		kanan.setLayout(new GridBagLayout());
		kanan.setPreferredSize(new Dimension(320, 513));
		kanan.add(panelCenter);	
		kiri.setLayout(new GridBagLayout());
		kiri.setPreferredSize(new Dimension(640, 513));
		kiri.add(panelCenter2);
		//Center panel

		//add panel to container
		this.add(kiri, BorderLayout.CENTER);
		this.add(kanan, BorderLayout.EAST);

	}

}
