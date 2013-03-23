package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.RoundLoaderCallback;
import ananas.lib.cardgame.core.RoundLoadingTask;

public class MyRoundLoadingTask implements RoundLoadingTask, Runnable {

	private DemoGame mGame;
	private RoundLoaderCallback mCallback;

	public MyRoundLoadingTask(DemoGame game, RoundLoaderCallback callback) {
		this.mGame = game;
		this.mCallback = callback;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
