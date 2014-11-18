package pl.shockah.hs.anim;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pl.shockah.func.Func2;
import com.github.zteve.smallcollections.SmallMap;

public class AnimQueue {
	public final List<Anim> queue = new ArrayList<>();
	public final Map<String, Func2<AnimQueue, Object[], Anim>> animBuilders = new SmallMap<>();
	
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