package pl.shockah.hs.carddefs;

import pl.shockah.hs.cards.Card;
import pl.shockah.hs.cards.MinionCard;

public class MinionCardDef extends CardDef {
	public int attack = 0, health = 1, cost = 0;
	
	public Card create() {
		MinionCard card = new MinionCard(this);
		card.attack = attack;
		card.health = health;
		card.cost = cost;
		return card;
	}
}