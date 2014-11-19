package pl.shockah.hs.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.Weapon;

public class PlayWeaponAnim extends Anim {
	public final Player player;
	public final Weapon weapon;
	
	public PlayWeaponAnim(Player player, Weapon weapon) {
		this.player = player;
		this.weapon = weapon;
	}
	
	public boolean update(AnimQueue queue) {
		if (player.hero.weapon != null) {
			queue.buildAndQueueFirst("DestroyWeapon", player.hero.weapon);
			return false;
		}
		return true;
	}
	
	public void finished(AnimQueue queue) {
		player.hand.remove(weapon.weaponCard);
		player.hero.weapon = weapon;
	}
}