package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.TubeFactory;

public interface Game {

	RoundLoader getRoundLoader();

	ImageResourceManager getImageResourceManager();

	CardClassManager getCardClassManager();

	TubeFactory getTubeFactory();
}
