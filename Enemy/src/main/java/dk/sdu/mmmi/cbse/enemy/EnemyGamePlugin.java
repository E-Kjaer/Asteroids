package dk.sdu.mmmi.cbse.enemy;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import dk.sdu.mmmi.cbse.commonEnemy.Enemy;

import java.util.Random;

public class EnemyGamePlugin implements IGamePluginService {
    @Override
    public void start(GameData gameData, World world) {
        for (int i = 0; i < 10; i++) {
            Random rnd = new Random();
            Entity enemy = new Enemy();
            //player.setPolygonCoordinates(15, 0, 3, 3, -3, 9, -3, 3, -9, 0, -3, -3, -3, -9, 3, -3);
            enemy.setPolygonCoordinates(11, 0, -1, 3, -7, 9, -7, 3, -13, 0, -7, -3, -7, -9, -1, -3);
            enemy.setColor(new int[]{254, 0 , 0});
            enemy.setY(gameData.getDisplayHeight() / 2 + 50);
            enemy.setX(gameData.getDisplayWidth() / 2 + 50);
            enemy.setRotation(rnd.nextInt(-180, 180));
            world.addEntity(enemy);
        }
    }

    @Override
    public void stop(GameData gameData, World world) {

    }
}
