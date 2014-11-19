package pl.shockah.hs.carddefs;

import pl.shockah.hs.cards.Card;
import pl.shockah.hs.cards.WeaponCard;

public class WeaponCardDef extends CardDef {
	public int attack = 0, durability = 1;
	
	public Card create() {
		WeaponCard card = new WeaponCard(this);
		card.attack = attack;
		card.durability = durability;
		card.cost = cost;
		return card;
	}
}