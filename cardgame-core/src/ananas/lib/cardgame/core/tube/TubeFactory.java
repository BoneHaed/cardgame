package ananas.lib.cardgame.core.tube;

import java.io.InputStream;

public interface TubeFactory {

	TubeImage createImage(InputStream in, double width, double height);

	TubeBuffer createBuffer(double width, double height);

	void runOnUIThread(Runnable runn);

}
