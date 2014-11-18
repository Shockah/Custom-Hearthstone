package pl.shockah.hs.game.lanterna.anim;

import pl.shockah.hs.Player;
import pl.shockah.hs.anim.AnimQueue;
import pl.shockah.hs.units.MinionUnit;

public class AnimQueue2 extends AnimQueue {
	public AnimQueue2() {
		animBuilders.put("PlayMinion", (queue, args) -> {
			return new PlayMinionAnim((Player)args[0], (MinionUnit)args[1], (int)(Integer)args[2]);
		});
	}
}