package ananas.lib.cardgame.core.tube;

public interface Tube {

	TubeFactory getFactory();

	void drawImage(TubeImage img, double x, double y);

}
