package mc.alk.arena.objects.queues;

import java.util.Collection;

import mc.alk.arena.objects.ArenaPlayer;
import mc.alk.arena.objects.MatchParams;

public interface TeamCollection extends Iterable<QueueObject>{
	/**
	 * Return the number of QueueObjects in the collection
	 * @return
	 */
	int size();

	/**
	 * Returns the number of players in the collection
	 * @return
	 */
	int playerSize();

	/**
	 * Returns the number of teams in the collection
	 * @return
	 */
	int teamSize();

	MatchParams getMatchParams();

	boolean remove(QueueObject queueObject);

	boolean isEmpty();

	boolean add(QueueObject to);

	Collection<? extends ArenaPlayer> getArenaPlayers();


}
