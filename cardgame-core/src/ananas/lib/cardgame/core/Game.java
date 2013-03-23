package ananas.lib.cardgame.core;

public interface Game {

	RoundFactory getRoundFactory();

	ImageResourceManager getImageResourceManager();

	CardClassManager getCardClassManager();

}
