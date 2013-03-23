package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.GameFactory;
import ananas.lib.cardgame.core.tube.TubeFactory;

public class DemoGameFactory implements GameFactory {

	@Override
	public Game newGame(TubeFactory tubeFactory) {
		return new DemoGame(tubeFactory);
	}

}
