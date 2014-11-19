package pl.shockah.hs.units;

import pl.shockah.hs.events.EventHandler;

public abstract class Buff extends EventHandler {
	public final Unit unit;
	public final Unit backup;
	
	public Buff(Unit unit) {
		this.unit = unit;
		backup = unit.backup();
	}
	
	public void applyStats() {}
}