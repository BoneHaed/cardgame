package ananas.lib.cardgame.core.xmlgame;

import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.GameFactory;

public class XMLGameFactory implements GameFactory {

	private final XMLGameContext mXmlGameContext;

	public XMLGameFactory(XMLGameContext context) {
		this.mXmlGameContext = context;
	}

	@Override
	public Game createGame(CreateGameContext context) {

		XMLGameContext cc = this.mXmlGameContext;

		cc.aTubeFactory = context.getTubeFactory();

		return new XMLGame(cc);
	}

}
