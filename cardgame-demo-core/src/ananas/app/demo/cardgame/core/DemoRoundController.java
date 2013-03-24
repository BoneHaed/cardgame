package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.Round;
import ananas.lib.cardgame.core.RoundController;

public class DemoRoundController implements RoundController {

	private Round mRound;

	@Override
	public Round getRound() {
		return this.mRound;
	}

	@Override
	public void setRound(Round round) {
		this.mRound = round;
	}

	@Override
	public void onReset(Round round) {
		// TODO Auto-generated method stub

	}

}
