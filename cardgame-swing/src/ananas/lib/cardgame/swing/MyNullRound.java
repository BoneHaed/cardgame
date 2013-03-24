package ananas.lib.cardgame.swing;

import ananas.lib.cardgame.core.Background;
import ananas.lib.cardgame.core.CardClassManager;
import ananas.lib.cardgame.core.CardManager;
import ananas.lib.cardgame.core.CoordinateSystem;
import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.GroupManager;
import ananas.lib.cardgame.core.ImageResourceManager;
import ananas.lib.cardgame.core.Layer;
import ananas.lib.cardgame.core.LayerManager;
import ananas.lib.cardgame.core.PlayerManager;
import ananas.lib.cardgame.core.Round;
import ananas.lib.cardgame.core.RoundController;
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

	@Override
	public double targetX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double targetY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double x() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double y() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPosition(double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTargetPosition(double x, double y) {
		// TODO Auto-generated method stub

	}

	@Override
	public Layer getLayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLayer(Layer layer) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getExtendLeft() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getExtendRight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getExtendTop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getExtendBottom() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setExtends(double left, double top, double right, double bottom) {
		// TODO Auto-generated method stub

	}

	@Override
	public CoordinateSystem getCoordinateSystem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Round getRound() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Background getBackground() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setController(RoundController ctrl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public RoundController getController() {
		// TODO Auto-generated method stub
		return null;
	}

}
