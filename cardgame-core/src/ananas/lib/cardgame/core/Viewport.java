package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.Tube;

public interface Viewport {

	double getTop();

	double getLeft();

	double getRight();

	double getBottom();

	double getWidth();

	double getHeight();

	void setBound(double x, double y, double width, double height);

	void onDraw(Tube tube);

}
