package Draw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;

import javax.swing.JLabel;

import Actions.Main;
import GUI.Gui;
import GUI.IL;

public class Draw_Ksiazka extends JLabel {

	Gui gui = new Gui();
	int textWidth;
	IL il = new IL();
	DecimalFormat df = new DecimalFormat("###,###,###");
	DecimalFormat df2 = new DecimalFormat("###,###,###.#");

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Nauka/klik
		g.setFont(new Font("Arial", Font.PLAIN, 25));
		g.setColor(new Color(255, 255, 255, 255));

		
		g.setFont(new Font("Arial", Font.PLAIN, 25));
		String s = df2.format(Main.npc) + " N/k";
		textWidth = g.getFontMetrics().stringWidth(s);
		g.drawString(s, gui.width / 4 - textWidth / 2, 590);
		s =  df2.format(Main.liczbaKlikniec) + " razy kliknieto";
		textWidth = g.getFontMetrics().stringWidth(s);
		g.drawString(s, gui.width / 4 - textWidth / 2, 620);
		repaint();
	}

}
