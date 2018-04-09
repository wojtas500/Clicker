package GUI;

import javax.swing.JFrame;


import Actions.Main;
import Actions.MouseHandler;
import Draw.Draw_Main;
import Draw.Draw_Buttons;
import Draw.Draw_Ksiazka;

public class Gui {

	JFrame jf;
	Draw_Main d;
	Draw_Ksiazka dk;
	Draw_Buttons db;
	IL il = new IL();

	public final int width = 1280;
	public final int height = 720;

	public static int maxHeight, actualHeight = 0;



	public static Button bKsiazka, ugClicker;



	public void createGui() {
		bKsiazka = new Button(width / 4 - 96, 150, 192, 192);
		ugClicker = new Button(width / 4 - 75, 500, 150, 50);



		jf = new JFrame("Abstrakcyjny Interfejs");
		jf.setSize(width, height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.addMouseWheelListener(new MouseHandler());
		jf.setResizable(false);

		db = new Draw_Buttons();
		db.setSize(width, height);
		db.setVisible(true);
		db.requestFocus();
		db.addMouseListener(new MouseHandler());
		db.addMouseMotionListener(new MouseHandler());
		jf.add(db);

		dk = new Draw_Ksiazka();
		dk.setSize(width, height);
		dk.setVisible(true);
		dk.requestFocus();
		dk.addMouseListener(new MouseHandler());
		dk.addMouseMotionListener(new MouseHandler());
		jf.add(dk);



		d = new Draw_Main();
		d.setSize(width, height);
		d.setVisible(true);
		d.requestFocus();
		d.addMouseListener(new MouseHandler());
		d.addMouseMotionListener(new MouseHandler());
		jf.add(d);

		jf.setVisible(true);
	}

}
