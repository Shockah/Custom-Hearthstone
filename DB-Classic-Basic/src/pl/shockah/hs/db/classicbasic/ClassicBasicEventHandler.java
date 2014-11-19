package pl.shockah.hs.db.classicbasic;

import java.util.List;
import java.util.ListIterator;
import pl.shockah.hs.db.classicbasic.buffs.TauntBuff;
import pl.shockah.hs.events.EventHandler;
import pl.shockah.hs.units.Unit;

public class ClassicBasicEventHandler extends EventHandler {
	public void onFindAttackTargets(Unit source, List<Unit> units) {
		boolean foundTaunt = false;
		for (Unit unit2 : units)
			if (unit2.hasBuff(TauntBuff.class)) {
				foundTaunt = true;
				break;
			}
		if (foundTaunt) {
			for (ListIterator<Unit> it = units.listIterator(); it.hasNext();) {
				Unit unit = it.next();
				if (!unit.hasBuff(TauntBuff.class))
					it.remove();
			}
		}
	}
}