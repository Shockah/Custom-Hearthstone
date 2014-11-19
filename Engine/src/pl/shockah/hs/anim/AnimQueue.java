package pl.shockah.hs.anim;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pl.shockah.func.Func2;
import pl.shockah.hs.Player;
import pl.shockah.hs.units.Buff;
import pl.shockah.hs.units.MinionUnit;
import pl.shockah.hs.units.Unit;
import com.github.zteve.smallcollections.SmallMap;

public class AnimQueue {
	public final List<Anim> queue = new ArrayList<>();
	public final Map<String, Func2<AnimQueue, Object[], Anim>> animBuilders = new SmallMap<>();
	
	@SuppressWarnings("unchecked")
	public void setup() {
		animBuilders.put("PlayMinion", (queue, args) -> {
			return new PlayMinionAnim((Player)args[0], (MinionUnit)args[1], (int)(Integer)args[2]);
		});
		
		animBuilders.put("GiveBuff", (queue, args) -> {
			String name = args[1] instanceof String ? (String)args[1] : null;
			Class<? extends Buff> cls = args[1] instanceof Class<?> ? (Class<? extends Buff>)args[1] : null;
			if (name != null)
				return new GiveBuffAnim((Unit)args[0], name);
			else if (cls != null)
				return new GiveBuffAnim((Unit)args[0], cls);
			else
				return null;
		});
		
		animBuilders.put("EndBuff", (queue, args) -> {
			if (args[0] instanceof Buff)
				return new EndBuffAnim((Buff)args[0]);
			else
				return new EndBuffAnim((Unit)args[0], (Class<? extends Buff>)args[1]);
		});
	}
	
	public void update() {
		if (queue.isEmpty())
			return;
		boolean done = queue.get(0).update(this);
		if (done)
			queue.remove(0);
	}
	
	public Anim build(String name, Object... args) {
		if (!animBuilders.containsKey(name))
			return null;
		return animBuilders.get(name).f(this, args);
	}
	
	public Anim buildAndQueue(String name, Object... args) {
		Anim anim = build(name, args);
		queue(anim);
		return anim;
	}
	
	public void queue(Anim anim) {
		queue.add(anim);
	}
}