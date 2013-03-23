package ananas.lib.cardgame.swing;

import ananas.lib.cardgame.core.CardClassManager;
import ananas.lib.cardgame.core.CardManager;
import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.GroupManager;
import ananas.lib.cardgame.core.ImageResourceManager;
import ananas.lib.cardgame.core.LayerManager;
import ananas.lib.cardgame.core.PlayerManager;
import ananas.lib.cardgame.core.Round;
import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.Viewport;
import ananas.lib.cardgame.core.tube.Tube;
import ananas.lib.cardgame.core.tube.TubeFactory;

public class MyNullRound implements Round, Game, Viewport {

	@Override
	public Game getGame() {
		return this;
	}

	@Override
	public GroupManager getGroupManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardManager getCardManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LayerManager getLayerManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlayerManager getPlayerManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Viewport getViewport() {
		return this;
	}

	@Override
	public double getTop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getLeft() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBottom() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBound(double x, double y, double width, double height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDraw(Tube tube) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RoundLoader getRoundLoader() {
		// TODO Auto-generated method stub
		return null;
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
