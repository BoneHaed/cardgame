package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.TubeFactory;

public interface GameFactory {

	// Game newGame(TubeFactory tubeFactory);

	public interface CreateGameContext {

		TubeFactory getTubeFactory();
	}

	Game createGame(CreateGameContext context);

}
