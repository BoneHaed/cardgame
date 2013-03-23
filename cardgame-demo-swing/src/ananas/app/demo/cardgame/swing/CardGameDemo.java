package ananas.app.demo.cardgame.swing;

import javax.swing.JFrame;

import ananas.app.demo.cardgame.core.DemoGameFactory;
import ananas.lib.cardgame.core.Game;
import ananas.lib.cardgame.core.Round;
import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.RoundLoaderCallback;
import ananas.lib.cardgame.swing.JCardGamePanel;

public class CardGameDemo implements Runnable {

	public static void main(String[] args) {

		Runnable runn = new CardGameDemo();
		javax.swing.SwingUtilities.invokeLater(runn);
	}

	@Override
	public void run() {

		JCardGamePanel panel = new JCardGamePanel(null);

		DemoGameFactory factory = new DemoGameFactory();
		Game game = factory.newGame(panel.getTubeFactory());
		RoundLoader loader = game.getRoundLoader();
		loader.loadRound(new MyRoundHandler(panel));

		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setBounds(100, 100, 640, 480);
		frame.setTitle(this + "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

	class MyRoundHandler implements RoundLoaderCallback {

		private JCardGamePanel mPanel;

		public MyRoundHandler(JCardGamePanel panel) {
			this.mPanel = panel;
		}

		@Override
		public void onLoadingDone(Round round) {
			this.mPanel.setRound(round);
		}
	}
}
