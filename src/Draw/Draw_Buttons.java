package Draw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import GUI.Gui;
import GUI.IL;

public class Draw_Buttons extends JLabel {

	Gui gui = new Gui();
	IL il = new IL();
	
	int textWidth;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		//Ksiazka Button
		
		if(Gui.bKsiazka.isActive()){
			g.drawImage(il.iksiazka2, Gui.bKsiazka.getX() + 15, Gui.bKsiazka.getY() +15, Gui.bKsiazka.getWidth() -30, Gui.bKsiazka.getHeight() -30, null);
		}else{
			g.drawImage(il.iksiazka1, Gui.bKsiazka.getX(), Gui.bKsiazka.getY(), Gui.bKsiazka.getWidth(), Gui.bKsiazka.getHeight(), null);
		}

		
		repaint();

	}

}
