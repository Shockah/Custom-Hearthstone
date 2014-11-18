package pl.shockah.hs.events;

import java.util.ArrayList;
import java.util.List;
import pl.shockah.func.Func1;
import pl.shockah.hs.Board;
import pl.shockah.hs.Player;
import pl.shockah.hs.cards.Card;

public class EventManager {
	public static final EventHandler defaultHandler = new EventHandler();
	
	public static <A extends Enum<A>, B> A handleEnum(List<B> list, Func1<B, A> f) {
		A finalResult = null;
		for (B b : list) {
			A result = f.f(b);
			if (finalResult == null || result.ordinal() > finalResult.ordinal())
				finalResult = result;
		}
		return finalResult;
	}
	
	public final Board board;
	public final List<EventHandler> handlers = new ArrayList<>();
	
	public EventManager(Board board) {
		this.board = board;
		handlers.add(defaultHandler);
	}
	
	public CardPlayedAction preCardPlayed(Player player, Card card) {
		return handleEnum(handlers, (handler) -> handler.preCardPlayed(player, card));
	}
	public void postCardPlayed(Player player, Card card) {
		for (EventHandler handler : handlers)
			handler.preCardPlayed(player, card);
	}
}