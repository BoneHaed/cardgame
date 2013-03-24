package ananas.app.demo.cardgame.swing;

import javax.swing.JFrame;

import ananas.app.demo.cardgame.core.DemoGameFactory;
import ananas.lib.cardgame.swing.JCardGamePanel;

public class CardGameDemo implements Runnable {

	public static void main(String[] args) {
		Runnable runn = new CardGameDemo();
		javax.swing.SwingUtilities.invokeLater(runn);
	}

	@Override
	public void run() {

		JCardGamePanel panel = new JCardGamePanel();
		DemoGameFactory factory = DemoGameFactory.getFactory();
		panel.load(factory);

		JFrame frame = new JFrame();
		frame.setTitle(this + "");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setBounds(100, 100, 640, 480);

		frame.setVisible(true);
	}

}
