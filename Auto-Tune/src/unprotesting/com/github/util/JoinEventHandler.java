package unprotesting.com.github.util;

import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import unprotesting.com.github.Main;

public class JoinEventHandler implements Listener {

    public static Logger log = Logger.getLogger("Minecraft");
    
    @EventHandler
    public void onPlayerJoin(PlayerLoginEvent e) {
            Player p = e.getPlayer();
            UUID uuid = p.getUniqueId();
            Main.playerDataConfig.set(uuid + ".name", p.getName());
            Main.saveplayerdata();
        }
    }

  