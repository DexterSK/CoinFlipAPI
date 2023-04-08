package sk.DexterSK.CoinFlip.api.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CoinflipCompletedEvent extends Event {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private OfflinePlayer winner;
    private OfflinePlayer loser;
    private long winnings;

    public CoinflipCompletedEvent(OfflinePlayer winner, OfflinePlayer loser, long winnings) {
        this.winner = winner;
        this.loser = loser;
        this.winnings = winnings;
    }

    public OfflinePlayer getWinner() {
        return winner;
    }

    public OfflinePlayer getLoser() {
        return loser;
    }

    public long getWinnings() {
        return winnings;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }
}
