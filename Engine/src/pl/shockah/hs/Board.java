package pl.shockah.hs;

import pl.shockah.hs.anim.AnimQueue;
import pl.shockah.hs.events.EventManager;

public class Board {
	public static final int
		DEFAULT_PLAYERS = 2;
	
	public final AnimQueue animQueue;
	public final EventManager events;
	public final Player[] players;
	
	public Board(AnimQueue animQueue) {
		this(animQueue, DEFAULT_PLAYERS);
	}
	public Board(AnimQueue animQueue, int players) {
		this.animQueue = animQueue;
		events = new EventManager(this);
		this.players = new Player[players];
		for (int i = 0; i < players; i++)
			this.players[i] = new Player(this, i);
	}
}