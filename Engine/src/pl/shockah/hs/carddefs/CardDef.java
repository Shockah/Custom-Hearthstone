package pl.shockah.hs.carddefs;

import pl.shockah.hs.cards.Card;

public abstract class CardDef {
	public int cost = 0;
	
	public abstract Card create();
}