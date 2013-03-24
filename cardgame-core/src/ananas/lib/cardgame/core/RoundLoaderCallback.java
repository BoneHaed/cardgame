package ananas.lib.cardgame.core;

public interface RoundLoaderCallback {

	void onLoadingDone(Round round);

	void onError(Exception e);

}
