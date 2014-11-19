package pl.shockah.hs.db.classicbasic.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.anim.Anim;
import pl.shockah.hs.anim.AnimQueue;
import pl.shockah.hs.units.MinionUnit;

public class GiveChargeAnim extends Anim {
	public final Player player;
	public final MinionUnit minion;
	
	public GiveChargeAnim(Player player, MinionUnit minion) {
		this.player = player;
		this.minion = minion;
	}
	
	public void finished(AnimQueue queue) {
		minion.resting = false;
	}
}