package pl.shockah.hs.db.classicbasic.buffs;

import pl.shockah.hs.units.Buff;
import pl.shockah.hs.units.MinionUnit;
import pl.shockah.hs.units.Unit;

public class ChargeBuff extends Buff {
	public ChargeBuff(Unit unit) {
		super(unit);
	}
	
	public void onResolveMinionSummonEffects(MinionUnit minion) {
		if (minion != this.unit)
			return;
		if (unit.resting)
			unit.board.animQueue.buildAndQueue("GiveCharge", unit);
	}
}