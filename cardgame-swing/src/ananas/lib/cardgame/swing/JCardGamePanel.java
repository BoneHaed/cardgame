package ananas.lib.cardgame.swing;

import java.awt.AWTEvent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.GameFactory;
import ananas.lib.cardgame.core.GameFactory.CreateGameContext;
import ananas.lib.cardgame.core.Round;
import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.RoundLoaderCallback;
import ananas.lib.cardgame.core.Viewport;
import ananas.lib.cardgame.core.tube.Tube;
import ananas.lib.cardgame.core.tube.TubeFactory;

public class JCardGamePanel extends JPanel implements MouseMotionListener,
		MouseListener {

	private static final long serialVersionUID = 15641368416313L;

	private Round mRound;
	private final SwingTubeFactory mTubeFactory;

	public JCardGamePanel() {
		this.mTubeFactory = new SwingTubeFactory();
		this.mRound = null;
		this.init();
	}

	private void init() {
		this.setMouseListeners();
	}

	private void setMouseListeners() {
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		this.enableEvents(AWTEvent.MOUSE_EVENT_MASK
				| AWTEvent.MOUSE_MOTION_EVENT_MASK);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println(this + ".mouseDragged()");

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		// System.out.println(this + ".mouseMoved()");

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this + ".mouseClicked()");

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this + ".mouseEntered()");

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this + ".mouseExited()");

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this + ".mousePressed()");

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(this + ".mouseReleased()");

	}

	@Override
	public void paint(Graphics g) {
		this._paint(g);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// this._paint(g);
	}

	@Override
	protected void paintBorder(Graphics g) {
		// this._paint(g);
	}

	@Override
	protected void paintChildren(Graphics g) {
		// this._paint(g);
	}

	@Override
	public void paintComponents(Graphics g) {
		// this._paint(g);
	}

	@Override
	public void paintAll(Graphics g) {
		// this._paint(g);
	}

	private void _paint(Graphics g) {

		Round round = this._getRound();

		final int r, w, h;
		r = 20;
		w = this.getWidth();
		h = this.getHeight();

		Tube tube = this.mTubeFactory.tubeForAWTGraphics(g);
		Viewport viewport = round.getViewport();
		{
			// update viewport size
			final double w1 = viewport.getWidth();
			final double h1 = viewport.getHeight();
			if (Math.abs(w - w1) > (w1 / 10000)
					|| Math.abs(h - h1) > (h1 / 10000)) {
				viewport.setExtends(0, 0, w, h);
			}
		}
		viewport.onDraw(tube);
		g.drawRect(r, r, w - (r * 2), h - (r * 2));
	}

	private Round _getRound() {
		Round round = this.mRound;
		if (round == null) {
			round = new MyNullRound();
			this.mRound = round;
		}
		return round;
	}

	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		System.out.println(this + ".setSize()");
	}

	public void setRound(Round round) {
		this.mRound = round;
	}

	class MyCreateGameContext implements CreateGameContext {

		@Override
		public TubeFactory getTubeFactory() {
			return JCardGamePanel.this.mTubeFactory;
		}
	}

	public void load(GameFactory factory) {
		CreateGameContext context = new MyCreateGameContext();
		Game game = factory.createGame(context);
		RoundLoader ldr = game.getRoundLoader();
		RoundLoaderCallback callback = new RoundLoaderCallback() {

			@Override
			public void onLoadingDone(Round round) {
				round.reset();
				setRound(round);
			}

			@Override
			public void onError(Exception e) {
				setRound(null);
				javax.swing.JOptionPane.showMessageDialog(JCardGamePanel.this,
						e + "");
			}
		};
		ldr.loadRound(callback);
	}
}
