package ananas.lib.cardgame.core.xmlgame;

import ananas.lib.cardgame.core.CardClassManager;
import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.ImageResourceManager;
import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.tube.TubeFactory;

public class XMLGame implements Game {

	private final XMLGameContext mContext;

	public XMLGame(XMLGameContext context) {
		this.mContext = context;
	}

	@Override
	public RoundLoader getRoundLoader() {
		return new XMLGameRoundLoader(this.mContext);
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
		// TODO Auto-generated method stub
		return null;
	}

}
