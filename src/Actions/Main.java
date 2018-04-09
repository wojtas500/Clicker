package Actions;

import GUI.Gui;

public class Main {

	public static double punkty = 0;
	public static double nps = 0;
	public static double npc = 1;
	public static int liczbaKlikniec = 0;
	public static void main(String[] args) {

		Gui g = new Gui();
		g.createGui();
		new PunktyNauki();


	}

}
