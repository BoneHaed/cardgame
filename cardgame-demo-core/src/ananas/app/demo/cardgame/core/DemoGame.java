package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.AbstractGame;
import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.tube.TubeFactory;

public class DemoGame extends AbstractGame {

	public DemoGame(TubeFactory tubeFactory) {
		super(tubeFactory);
	}

	@Override
	public RoundLoader getRoundLoader() {
		return new MyRoundLoader(this);
	}

}
