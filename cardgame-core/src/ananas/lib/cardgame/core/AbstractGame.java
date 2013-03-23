package ananas.lib.cardgame.core;

import ananas.lib.cardgame.core.tube.TubeFactory;

public class AbstractGame implements Game {

	private final TubeFactory mTubeFactory;

	public AbstractGame(TubeFactory tubeFactory) {
		this.mTubeFactory = tubeFactory;
	}

	@Override
	public RoundLoader getRoundLoader() {
		// TODO Auto-generated method stub
		throw new RuntimeException("implements this method in sub class!");
		// return null;
	}

	@Override
	public ImageResourceManager getImageResourceManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardClassManager getCardClassManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TubeFactory getTubeFactory() {
		return this.mTubeFactory;
	}

}
