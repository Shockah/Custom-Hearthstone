package pl.shockah.hs.cards;

import pl.shockah.hs.Player;
import pl.shockah.hs.Weapon;
import pl.shockah.hs.carddefs.WeaponCardDef;

public class WeaponCard extends Card {
	public int attack = 1, durability = 1, cost = 0;
	
	public WeaponCard(WeaponCardDef def) {
		super(def);
	}
	
	public void play(Player player) {
		player.board.animQueue.buildAndQueue("PlayWeapon", player, create(player));
	}
	
	public Weapon create(Player player) {
		return new Weapon(player, this);
	}
}