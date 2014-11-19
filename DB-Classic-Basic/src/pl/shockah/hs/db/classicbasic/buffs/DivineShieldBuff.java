package pl.shockah.hs.db.classicbasic.buffs;

import pl.shockah.Box;
import pl.shockah.hs.units.Buff;
import pl.shockah.hs.units.MinionUnit;
import pl.shockah.hs.units.Unit;

public class DivineShieldBuff extends Buff {
	public DivineShieldBuff(Unit unit) {
		super(unit);
	}
	
	public void preUnitDamaged(Unit unit, Box<Integer> damage) {
		if (unit != this.unit)
			return;
		damage.value = 0;
		unit.board.animQueue.buildAndQueue("EndBuff", this);
	}
	
	public void onResolveMinionSummonEffects(MinionUnit minion) {
		if (minion != this.unit)
			return;
		if (unit.resting)
			unit.board.animQueue.buildAndQueue("GiveCharge", unit);
	}
}