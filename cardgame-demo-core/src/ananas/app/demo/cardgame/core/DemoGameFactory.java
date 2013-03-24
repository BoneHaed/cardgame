package ananas.app.demo.cardgame.core;

import ananas.lib.cardgame.core.xmlgame.XMLGameContext;
import ananas.lib.cardgame.core.xmlgame.XMLGameFactory;

public class DemoGameFactory extends XMLGameFactory {

	public DemoGameFactory(XMLGameContext context) {
		super(context);
	}

	public static DemoGameFactory getFactory() {

		XMLGameContext context = new XMLGameContext();

		context.aRoundControllerFactory = new DemoRoundControllerFactory();
		context.aXmlDocumentURI = "resource:///demo/round1.xml";

		return new DemoGameFactory(context);
	}
}
