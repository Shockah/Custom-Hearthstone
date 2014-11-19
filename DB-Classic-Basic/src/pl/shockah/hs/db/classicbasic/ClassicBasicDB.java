package pl.shockah.hs.db.classicbasic;

import pl.shockah.hs.Board;
import pl.shockah.hs.Player;
import pl.shockah.hs.carddefs.DBCode;
import pl.shockah.hs.db.classicbasic.anim.GiveChargeAnim;
import pl.shockah.hs.db.classicbasic.anim.GiveDivineShieldAnim;
import pl.shockah.hs.db.classicbasic.anim.GiveTauntAnim;
import pl.shockah.hs.db.classicbasic.buffs.ChargeBuff;
import pl.shockah.hs.db.classicbasic.buffs.DivineShieldBuff;
import pl.shockah.hs.db.classicbasic.buffs.TauntBuff;
import pl.shockah.hs.units.MinionUnit;

public class ClassicBasicDB extends DBCode {
	public void setup(Board board) {
		board.animQueue.animBuilders.put("GiveCharge", (queue, args) -> {
			return new GiveChargeAnim((Player)args[0], (MinionUnit)args[1]);
		});
		board.animQueue.animBuilders.put("GiveTaunt", (queue, args) -> {
			return new GiveTauntAnim((Player)args[0], (MinionUnit)args[1]);
		});
		board.animQueue.animBuilders.put("GiveDivineShield", (queue, args) -> {
			return new GiveDivineShieldAnim((Player)args[0], (MinionUnit)args[1]);
		});
		
		registerBuff("Charge", ChargeBuff.class, (unit, args) -> {
			return new ChargeBuff(unit);
		});
		registerBuff("Taunt", TauntBuff.class, (unit, args) -> {
			return new TauntBuff(unit);
		});
		registerBuff("DivineShield", DivineShieldBuff.class, (unit, args) -> {
			return new DivineShieldBuff(unit);
		});
		
		handler = new ClassicBasicEventHandler();
	}
}