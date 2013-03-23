package ananas.lib.cardgame.swing;

import java.awt.Graphics;
import java.io.InputStream;

import ananas.lib.cardgame.core.tube.Tube;
import ananas.lib.cardgame.core.tube.TubeBuffer;
import ananas.lib.cardgame.core.tube.TubeFactory;
import ananas.lib.cardgame.core.tube.TubeImage;

public class SwingTubeFactory implements TubeFactory {

	@Override
	public TubeImage createImage(InputStream in, double width, double height) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TubeBuffer createBuffer(double width, double height) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void runOnUIThread(Runnable runn) {
		// TODO Auto-generated method stub
		
	}

	public Tube tubeForAWTGraphics(Graphics g) {
		// TODO Auto-generated method stub
		return null;
	}

}
