package pl.shockah.hs.anim;

import pl.shockah.hs.units.Buff;
import pl.shockah.hs.units.Unit;

public class EndBuffAnim extends Anim {
	public final Unit unit;
	public final Class<? extends Buff> cls;
	public final Buff buff;
	
	public EndBuffAnim(Buff buff) {
		unit = null;
		cls = null;
		this.buff = buff;
	}
	public EndBuffAnim(Unit unit, Class<? extends Buff> cls) {
		this.unit = unit;
		this.cls = cls;
		buff = null;
	}
	
	public void finished(AnimQueue queue) {
		if (unit != null && cls != null)
			unit.endBuff(cls);
		else if (buff != null)
			buff.end();
	}
}