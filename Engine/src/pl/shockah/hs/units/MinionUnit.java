package pl.shockah.hs.units;

import pl.shockah.hs.Player;
import pl.shockah.hs.cards.Card;

public class MinionUnit extends Unit {
	public final Card card;
	
	public MinionUnit(Player player, Card card) {
		super(player);
		this.card = card;
	}
}