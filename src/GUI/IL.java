package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Actions.Main;

public class IL {
	
	public BufferedImage ibg;
	public BufferedImage iksiazka1, iksiazka2;

	public IL() {
		
		try {
			ibg = ImageIO.read(new File("rsc/bg.png"));
			iksiazka1 = ImageIO.read(new File("rsc/ksiazka1.png"));
			iksiazka2 = ImageIO.read(new File("rsc/ksiazka2.png"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
}
