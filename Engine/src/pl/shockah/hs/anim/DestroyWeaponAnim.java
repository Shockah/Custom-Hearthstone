package pl.shockah.hs.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.Weapon;
import pl.shockah.hs.units.HeroUnit;

public class DestroyWeaponAnim extends Anim {
	public final Weapon weapon;
	
	public DestroyWeaponAnim(Player player) {
		weapon = player.hero.weapon;
	}
	public DestroyWeaponAnim(HeroUnit hero) {
		weapon = hero.weapon;
	}
	public DestroyWeaponAnim(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void finished(AnimQueue queue) {
		weapon.destroy();
	}
}