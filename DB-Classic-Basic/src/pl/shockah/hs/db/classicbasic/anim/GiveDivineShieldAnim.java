package pl.shockah.hs.db.classicbasic.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.anim.Anim;
import pl.shockah.hs.units.MinionUnit;

public class GiveDivineShieldAnim extends Anim {
	public final Player player;
	public final MinionUnit minion;
	
	public GiveDivineShieldAnim(Player player, MinionUnit minion) {
		this.player = player;
		this.minion = minion;
	}
}