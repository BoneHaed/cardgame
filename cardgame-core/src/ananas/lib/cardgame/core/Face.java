package ananas.lib.cardgame.core;

public interface Face {

	Face up = F.newInst("UP");
	Face down = F.newInst("DOWN");

	boolean isUp();

	boolean isDown();

	class F {

		private static Face newInst(String string) {
			return new MyImpl(string);
		}

		private static class MyImpl implements Face {

			private String mString;

			public MyImpl(String string) {
				this.mString = string;
			}

			@Override
			public boolean isUp() {
				return this.equals(Face.up);
			}

			@Override
			public boolean isDown() {
				return this.equals(Face.down);
			}

			public String toString() {
				return this.mString;
			}
		}
	}

}
