package pl.shockah.hs.events;

import java.util.List;
import pl.shockah.hs.Player;
import pl.shockah.hs.cards.Card;
import pl.shockah.hs.units.MinionUnit;
import pl.shockah.hs.units.Unit;

public class EventHandler {
	public CardPlayedAction preCardPlayed(Player player, Card card) { return CardPlayedAction.Continue; }
	public void postCardPlayed(Player player, Card card) {}
	
	public MinionSummonedAction preMinionSummoned(Player player, MinionUnit minion) { return MinionSummonedAction.Continue; }
	public void postMinionSummoned(Player player, MinionUnit minion) {}
	public void onResolveMinionSummonEffects(MinionUnit minion) {}
	
	public void onFindAttackTargets(Unit source, List<Unit> units) {}
}