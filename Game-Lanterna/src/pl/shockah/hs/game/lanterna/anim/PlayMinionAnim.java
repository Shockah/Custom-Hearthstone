package pl.shockah.hs.game.lanterna.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.anim.AnimQueue;
import pl.shockah.hs.units.MinionUnit;

public class PlayMinionAnim extends Anim2 {
	public final Player player;
	public final MinionUnit minion;
	public final int position;
	
	public PlayMinionAnim(Player player, MinionUnit minion, int position) {
		this.player = player;
		this.minion = minion;
		this.position = position;
	}
	
	public boolean update(AnimQueue queue) {
		player.hand.remove(minion.card);
		if (position == -1)
			player.minions.add(minion);
		else
			player.minions.add(position, minion);
		return true;
	}
}