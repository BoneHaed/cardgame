package ananas.lib.cardgame.core;

public interface RoundController {

	Round getRound();

	void setRound(Round round);

	void onReset(Round round);
}
