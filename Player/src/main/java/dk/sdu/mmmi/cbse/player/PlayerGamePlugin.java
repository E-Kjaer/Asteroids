package dk.sdu.mmmi.cbse.player;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonPlayer.Player;

public class PlayerGamePlugin implements IGamePluginService {
    @Override
    public void start(GameData gameData, World world) {
        Player player = new Player();
        //player.setPolygonCoordinates(15, 0, 3, 3, -3, 9, -3, 3, -9, 0, -3, -3, -3, -9, 3, -3);
        player.setPolygonCoordinates(11, 0, -1, 3, -7, 9, -7, 3, -13, 0, -7, -3, -7, -9, -1, -3);
        player.setColor(new int[]{0, 0 , 254});
        player.setY(gameData.getDisplayHeight() / 2);
        player.setX(gameData.getDisplayWidth() / 2);
        player.setRotation(-90);
        player.setBulletCooldown(100);
        player.setRadius(5);
        player.setHealth(10);
        player.setDamage(5);
        world.addEntity(player);
    }

    @Override
    public void stop(GameData gameData, World world) {

    }
}
