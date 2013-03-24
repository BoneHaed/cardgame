package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.Tube;

public interface VisualObject extends RoundObject, CoordinateSystem {

	/**
	 * position
	 * */
	double targetX();

	double targetY();

	double x();

	double y();

	void setPosition(double x, double y);

	void setTargetPosition(double x, double y);

	/**
	 * layer
	 * */
	Layer getLayer();

	void setLayer(Layer layer);

	/**
	 * extends
	 * */
	double getExtendLeft();

	double getExtendRight();

	double getExtendTop();

	double getExtendBottom();

	void setExtends(double left, double top, double right, double bottom);

	double getWidth();

	double getHeight();

	/**
	 * drawing
	 * */
	void onDraw(Tube tube);

	CoordinateSystem getCoordinateSystem();

}
