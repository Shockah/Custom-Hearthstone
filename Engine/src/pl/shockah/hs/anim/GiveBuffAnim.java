package pl.shockah.hs.anim;

import pl.shockah.hs.units.Buff;
import pl.shockah.hs.units.Unit;

public class GiveBuffAnim extends Anim {
	public final Unit unit;
	public final String name;
	public final Class<? extends Buff> cls;
	public final Object[] args;
	
	public GiveBuffAnim(Unit unit, String name, Object... args) {
		this.unit = unit;
		this.name = name;
		cls = null;
		this.args = args;
	}
	public GiveBuffAnim(Unit unit, Class<? extends Buff> cls, Object... args) {
		this.unit = unit;
		name = null;
		this.cls = cls;
		this.args = args;
	}
	
	public void finished(AnimQueue queue) {
		if (name != null)
			unit.addBuff(name, args);
		else if (cls != null)
			unit.addBuff(cls, args);
	}
}