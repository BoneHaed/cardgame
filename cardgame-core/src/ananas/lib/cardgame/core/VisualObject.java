package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.Tube;

public interface VisualObject extends RoundObject {

	Viewport getViewport();

	double x();

	double y();

	Layer getLayer();

	void setLayer(Layer layer);

	double boundLeft();

	double boundRight();

	double boundTop();

	double boundBottom();

	void onDraw(Tube tube);

}
