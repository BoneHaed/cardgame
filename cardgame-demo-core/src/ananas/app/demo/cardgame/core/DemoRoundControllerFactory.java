package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.RoundController;
import ananas.lib.cardgame.core.RoundControllerFactory;

public class DemoRoundControllerFactory implements RoundControllerFactory {

	@Override
	public RoundController createController() {
		return new DemoRoundController();
	}

}
