package pl.shockah.hs.events;

import pl.shockah.hs.Player;
import pl.shockah.hs.cards.Card;

public class EventHandler {
	public CardPlayedAction preCardPlayed(Player player, Card card) { return CardPlayedAction.Continue; }
}