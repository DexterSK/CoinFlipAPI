package sk.DexterSK.CoinFlip.api;

import sk.DexterSK.CoinFlip.economy.provider.EconomyProvider;
import sk.DexterSK.CoinFlip.storage.PlayerData;
import java.util.Optional;
import org.bukkit.entity.Player;

public interface CoinFlipAPI
{
	/**
     * Register a custom economy provider with a required plugin.
     * We will check if the plugin is enabled.
     *
     * @param provider The economy provider
     * @param requiredPlugin The plugin required
     */
	void registerEconomyProvider( EconomyProvider provider, String requiredPlugin );
  
	/**
     * Fetch player data
     *
     * @param player The player to search
     * @return  Optional of player data, represents if they are loaded in cache
     */
	Optional<PlayerData> getPlayerData( Player player );
}
