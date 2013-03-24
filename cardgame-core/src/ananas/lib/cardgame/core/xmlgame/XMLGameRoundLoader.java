package ananas.lib.cardgame.core.xmlgame;

import java.io.IOException;

import org.xml.sax.SAXException;

import ananas.lib.blueprint3.core.Blueprint;
import ananas.lib.blueprint3.core.dom.BPDocument;
import ananas.lib.blueprint3.core.dom.BPElement;
import ananas.lib.blueprint3.core.lang.BPEnvironment;
import ananas.lib.blueprint3.loader.eom.EOM;
import ananas.lib.cardgame.core.Round;
import ananas.lib.cardgame.core.RoundLoader;
import ananas.lib.cardgame.core.RoundLoaderCallback;
import ananas.lib.cardgame.core.RoundLoadingTask;
import ananas.lib.cardgame.core.xmlgame.element.XMLGameNamespaceInfo;

public class XMLGameRoundLoader implements RoundLoader {

	private final XMLGameContext mGameContext;

	public XMLGameRoundLoader(XMLGameContext context) {
		this.mGameContext = context;
	}

	@Override
	public RoundLoadingTask loadRound(RoundLoaderCallback callback) {
		MyTask task = new MyTask(callback);
		Thread thd = (new Thread(task));
		thd.start();
		return task;
	}

	class MyTask implements RoundLoadingTask, Runnable {

		private final RoundLoaderCallback mCallback;

		public MyTask(RoundLoaderCallback callback) {
			this.mCallback = callback;
		}

		@Override
		public void run() {
			RoundLoaderCallback callback = new MyCallbackProxy(this.mCallback);
			try {
				Round round = this._doLoad();
				callback.onLoadingDone(round);
			} catch (Exception e) {
				e.printStackTrace();
				callback.onLoadingDone(null);
			}

		}

		private Round _doLoad() throws IOException, SAXException {

			EOM.init();
			BPEnvironment envi = Blueprint.getInstance().defaultEnvironment();
			envi.loadNamespace(XMLGameNamespaceInfo.class, true);

			XMLGameContext context = XMLGameRoundLoader.this.mGameContext;
			BPDocument doc = Blueprint.loadDocument(context.aXmlDocumentURI);

			BPElement root = doc.getRootElement();

			return null;

		}
	}

	class MyCallbackProxy implements RoundLoaderCallback {

		private final RoundLoaderCallback mTarget;

		public MyCallbackProxy(RoundLoaderCallback target) {
			this.mTarget = target;
		}

		@Override
		public void onLoadingDone(Round round) {
			class MyCaller implements Runnable {
				private RoundLoaderCallback mTarget;
				private Round mRound;

				public MyCaller(RoundLoaderCallback target, Round round) {
					this.mTarget = target;
					this.mRound = round;
				}

				@Override
				public void run() {
					this.mTarget.onLoadingDone(mRound);
				}
			}
			MyCaller caller = new MyCaller(this.mTarget, round);
			XMLGameContext context = XMLGameRoundLoader.this.mGameContext;
			context.aTubeFactory.runOnUIThread(caller);
		}

		@Override
		public void onError(Exception e) {
			class MyCaller implements Runnable {
				private RoundLoaderCallback mTarget;
				private Exception mError;

				public MyCaller(RoundLoaderCallback target, Exception e) {
					this.mTarget = target;
					this.mError = e;
				}

				@Override
				public void run() {
					this.mTarget.onError(this.mError);
				}
			}
			MyCaller caller = new MyCaller(this.mTarget, e);
			XMLGameContext context = XMLGameRoundLoader.this.mGameContext;
			context.aTubeFactory.runOnUIThread(caller);
		}
	}

}
