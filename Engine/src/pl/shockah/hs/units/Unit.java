package pl.shockah.hs.units;

import java.util.ArrayList;
import java.util.List;
import pl.shockah.hs.Board;
import pl.shockah.hs.Player;

public class Unit {
	public final Board board;
	public final Player player;
	
	public boolean resting = true;
	public int attacksThisTurn = 0;
	public int attack = 0, health = 1;
	public final List<Buff> buffs = new ArrayList<>();
	
	public Unit(Player player) {
		board = player.board;
		this.player = player;
	}
	
	public Unit backup() {
		Unit unit = new Unit(player);
		unit.resting = resting;
		unit.attacksThisTurn = attacksThisTurn;
		unit.attack = attack;
		unit.health = health;
		unit.buffs.addAll(buffs);
		return unit;
	}
	public void restore(Unit unit) {
		resting = unit.resting;
		attacksThisTurn = unit.attacksThisTurn;
		attack = unit.attack;
		health = unit.health;
		buffs.clear(); buffs.addAll(unit.buffs);
	}
	
	public void addBuff(String name, Object... args) {
		// TODO: look for a buff in all DBs, construct it
		//buffs.add();
	}
	public void addBuff(Class<? extends Buff> cls, Object... args) {
		// TODO: look for a buff in all DBs, construct it
		//buffs.add();
	}
	
	public boolean hasBuff(Class<? extends Buff> cls) {
		for (Buff buff : buffs)
			if (cls.isAssignableFrom(buff.getClass()))
				return true;
		return false;
	}
	
	public void endBuff(Class<? extends Buff> cls) {
		Buff buff = null;
		for (Buff buff2 : buffs)
			if (cls.isAssignableFrom(buff2.getClass())) {
				buff = buff2;
				break;
			}
		if (buff != null)
			buff.end();
	}
}