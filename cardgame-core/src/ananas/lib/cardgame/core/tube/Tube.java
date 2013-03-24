package ananas.lib.cardgame.core.tube;

import ananas.lib.cardgame.core.CoordinateSystem;

public interface Tube {

	TubeFactory getFactory();

	void drawImage(TubeImage img, double x, double y);

	CoordinateSystem getCoordinateSystem();

}
