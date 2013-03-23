package ananas.lib.cardgame.core;

public interface Card extends VisualObject {

	Group getGroup();

	void setGroup(Group group);

	CardClass getCardClass();

	String getId();

	Face getFace();

	void setFace(Face face);
}
