package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.RoundLoaderCallback;
import ananas.lib.cardgame.core.RoundLoadingTask;

public class MyRoundLoader implements RoundLoader {

	private DemoGame mGame;

	public MyRoundLoader(DemoGame game) {
		this.mGame = game;
	}

	@Override
	public RoundLoadingTask loadRound(RoundLoaderCallback callback) {
		MyRoundLoadingTask runn = new MyRoundLoadingTask(this.mGame, callback);
		(new Thread(runn)).start();
		return runn;
	}

}
