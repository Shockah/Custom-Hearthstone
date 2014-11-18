package pl.shockah.hs;

import java.util.ArrayList;
import java.util.List;
import pl.shockah.hs.cards.Card;
import pl.shockah.hs.units.MinionUnit;

public class Player {
	public static final int
		DEFAULT_DECK_SIZE = 30,
		DEFAULT_HAND_SIZE = 10,
		DEFAULT_MINIONS_SIZE = 7;
	
	public final Board board;
	public final int boardIndex;
	
	public final List<Card> deck, hand;
	public final List<MinionUnit> minions;
	
	public Player(Board board, int boardIndex) {
		this(board, boardIndex, DEFAULT_DECK_SIZE, DEFAULT_HAND_SIZE, DEFAULT_MINIONS_SIZE);
	}
	public Player(Board board, int boardIndex, int deckSize, int handSize, int minionsSize) {
		this.board = board;
		this.boardIndex = boardIndex;
		deck = new ArrayList<>(deckSize);
		hand = new ArrayList<>(handSize);
		minions = new ArrayList<>(minionsSize);
	}
}