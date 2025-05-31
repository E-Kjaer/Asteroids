package dk.sdu.mmmi.cbse.player;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.commonPlayer.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PlayerGamePluginTest {
    World world;
    GameData gameData;
    PlayerGamePlugin playerGamePlugin;

    @BeforeEach
    public void setup() {
        world = new World();
        gameData = new GameData();
        playerGamePlugin = new PlayerGamePlugin();
    }

    @Test
    public void testPluginSpawnsPlayer() {
        assertTrue(world.getEntities(Player.class).isEmpty());

        playerGamePlugin.start(gameData, world);

        assertFalse(world.getEntities(Player.class).isEmpty());
    }
}