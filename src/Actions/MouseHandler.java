package Actions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


import GUI.Gui;


public class MouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {

	Gui gui = new Gui();
	MouseCollision mc = new MouseCollision();

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

		// Cookie Button
		if (mc.inside(e.getX(), e.getY(), Gui.bKsiazka)) {
			Gui.bKsiazka.setActive(true);
			Main.punkty += Main.npc;
			Main.liczbaKlikniec++;
		}

		

		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// Cookie Button
		if (Gui.bKsiazka.isActive()) {
			Gui.bKsiazka.setActive(false);

		}

	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {






	}
}
