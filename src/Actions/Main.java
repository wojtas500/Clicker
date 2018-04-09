package Actions;

import GUI.Gui;

public class Main {

	public static double punkty = 0;
	public static double nps = 0;
	public static double npc = 1;
	public static int liczbaKlikniec = 0;
package Actions;

import GUI.Gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main implements Serializable{
	
	public static double punkty = 0;
	public static double nps = 0;
	public static double npc = 1;
	public static int liczbaKlikniec = 0;
	
	public static void main(String[] args) throws Exception{

		Gui g = new Gui();
		g.createGui();
		new PunktyNauki();

		Main save = new Main();
		
		File f = new File("save.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(save);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Main load = (Main) ois.readObject();
		
		
	}
	

}
