package pl.shockah.hs.units;

import pl.shockah.hs.Player;
import pl.shockah.hs.Weapon;

public class HeroUnit extends Unit {
	public Weapon weapon = null;
	
	public HeroUnit(Player player) {
		super(player);
	}
}