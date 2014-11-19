package pl.shockah.hs.db.classicbasic.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.anim.Anim;
import pl.shockah.hs.units.MinionUnit;

public class GiveTauntAnim extends Anim {
	public final Player player;
	public final MinionUnit minion;
	
	public GiveTauntAnim(Player player, MinionUnit minion) {
		this.player = player;
		this.minion = minion;
	}
}