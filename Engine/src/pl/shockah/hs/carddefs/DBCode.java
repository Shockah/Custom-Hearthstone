package pl.shockah.hs.carddefs;

import java.util.Map;
import pl.shockah.func.Func2;
import pl.shockah.hs.Board;
import pl.shockah.hs.events.EventHandler;
import pl.shockah.hs.units.Buff;
import pl.shockah.hs.units.Unit;
import com.github.zteve.smallcollections.SmallMap;

public class DBCode {
	public final Map<String, Class<? extends Buff>> buffClasses = new SmallMap<>();
	public final Map<Class<? extends Buff>, Func2<Unit, Object[], Buff>> buffBuilders = new SmallMap<>();
	
	public EventHandler handler = null;
	
	public void setup(Board board) {}
	
	public final void registerBuff(String name, Class<? extends Buff> cls, Func2<Unit, Object[], Buff> f) {
		buffClasses.put(name, cls);
		buffBuilders.put(cls, f);
	}
	
	public Buff buildBuff(String name, Unit unit, Object... args) {
		return buildBuff(buffClasses.get(name), unit, args);
	}
	public Buff buildBuff(Class<? extends Buff> cls, Unit unit, Object... args) {
		return buffBuilders.get(cls).f(unit, args);
	}
}