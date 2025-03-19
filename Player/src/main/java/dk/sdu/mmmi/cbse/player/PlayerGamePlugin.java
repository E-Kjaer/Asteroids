package dk.sdu.mmmi.cbse.player;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonPlayer.Player;

public class PlayerGamePlugin implements IGamePluginService {
    @Override
    public void start(GameData gameData, World world) {
        Entity player = new Player();
        player.setPolygonCoordinates(15, 0, 3, 3, -3, 9, -3, 3, -9, 0, -3, -3, -3, -9, 3, -3);
        player.setColor(new int[]{0, 0 , 254});
        player.setY(gameData.getDisplayHeight() / 2);
        player.setX(gameData.getDisplayWidth() / 2);
        player.setRotation(-90);
        world.addEntity(player);
    }

    @Override
    public void stop(GameData gameData, World world) {

    }
}
