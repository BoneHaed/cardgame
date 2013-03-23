package ananas.lib.cardgame.core;

public interface Round {

	Game getGame();

	GroupManager getGroupManager();

	CardManager getCardManager();

	LayerManager getLayerManager();

	PlayerManager getPlayerManager();
}
