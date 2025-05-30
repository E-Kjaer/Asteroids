package dk.sdu.mmmi.cbse.enemy;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.commonBullet.IBulletSPI;
import dk.sdu.mmmi.cbse.commonEnemy.Enemy;

import java.util.Collection;
import java.util.Random;
import java.util.ServiceLoader;

import static java.util.stream.Collectors.toList;

public class EnemyProcessor implements IEntityProcessingService {
    @Override
    public void process(GameData gameData, World world) {
        for (Entity enemy : world.getEntities(Enemy.class)) {
            Random rnd = new Random();
            double changeX = Math.cos(Math.toRadians(enemy.getRotation()));
            double changeY = Math.sin(Math.toRadians(enemy.getRotation()));

            enemy.setX(enemy.getX() + changeX * 1.5);
            enemy.setY(enemy.getY() + changeY * 1.5);

            if (enemy.getX() > gameData.getDisplayWidth()) {
                enemy.setX(0);
            }

            if (enemy.getX() < 0) {
                enemy.setX(gameData.getDisplayWidth());
            }

            if (enemy.getY() > gameData.getDisplayHeight()) {
                enemy.setY(0);
            }

            if (enemy.getY() < 0) {
                enemy.setY(gameData.getDisplayHeight());
            }

            if (rnd.nextFloat() < 0.01) {
                if (getBulletSPIs().stream().findFirst().isPresent()) {
                    world.addEntity(getBulletSPIs().stream().findFirst().get().createBullet(enemy));
                }
            }
        }
    }

    private Collection<? extends IBulletSPI> getBulletSPIs() {
        return ServiceLoader.load(IBulletSPI.class).stream().map(ServiceLoader.Provider::get).collect(toList());
    }
}
