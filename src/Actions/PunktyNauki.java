package Actions;

import java.util.Timer;
import java.util.TimerTask;

public class PunktyNauki {
	
	Timer count;

	public PunktyNauki() {
		count = new Timer();
		count.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {

				Main.punkty += Main.nps/100;
				
			}
		}, 0, 10);
	}

}
