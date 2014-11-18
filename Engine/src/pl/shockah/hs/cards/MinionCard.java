package pl.shockah.hs.cards;

import pl.shockah.hs.Player;
import pl.shockah.hs.carddefs.CardDef;
import pl.shockah.hs.units.MinionUnit;

public class MinionCard extends Card {
	public int attack = 0, health = 1, cost = 0;
	
	public MinionCard(CardDef def) {
		super(def);
	}
	
	public void play(Player player) {
		play(player, -1);
	}
	public void play(Player player, int position) {
		if (position < 0)
			position = player.minions.size();
		if (position >= player.minions.size())
			position = -1;
		player.board.animQueue.buildAndQueue("PlayMinion", player, create(player), position);
	}
	
	public MinionUnit create(Player player) {
		return new MinionUnit(player, this);
	}
}