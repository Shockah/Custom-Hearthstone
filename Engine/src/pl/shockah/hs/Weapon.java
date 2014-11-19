package pl.shockah.hs;

import pl.shockah.hs.cards.WeaponCard;

public class Weapon {
	public final Board board;
	public final Player player;
	public final WeaponCard weaponCard;
	
	public Weapon(Player player, WeaponCard weaponCard) {
		board = player.board;
		this.player = player;
		this.weaponCard = weaponCard;
	}
	
	public void destroy() {
		player.hero.weapon = null;
	}
}