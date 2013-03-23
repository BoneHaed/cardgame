package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.TubeFactory;

public interface GameFactory {

	Game newGame(TubeFactory tubeFactory);

}
