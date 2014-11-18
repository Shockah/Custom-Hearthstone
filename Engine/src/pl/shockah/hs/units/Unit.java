package pl.shockah.hs.units;

import pl.shockah.hs.Board;
import pl.shockah.hs.Player;

public class Unit {
	public final Board board;
	public final Player player;
	
	public Unit(Player player) {
		board = player.board;
		this.player = player;
	}
}