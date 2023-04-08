package sk.DexterSK.CoinFlip.api.events;

import sk.DexterSK.CoinFlip.game.CoinFlipGame;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CoinflipCreatedEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS_LIST = new HandlerList();

    private final Player player;
    private final CoinFlipGame CoinFlipGame;
    private boolean cancelled;

    public CoinflipCreatedEvent(Player player, CoinFlipGame CoinFlipGame) {
        this.player = player;
        this.CoinFlipGame = CoinFlipGame;
    }

    public Player getPlayer() {
        return player;
    }

    public CoinFlipGame getCoinFlipGame() {
        return CoinFlipGame;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS_LIST;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }
}