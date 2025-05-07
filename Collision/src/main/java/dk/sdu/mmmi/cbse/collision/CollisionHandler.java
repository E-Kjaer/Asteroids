package dk.sdu.mmmi.cbse.collision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.commonAsteroid.Asteroid;
import dk.sdu.mmmi.cbse.commonAsteroid.IAsteroidSplitter;
import dk.sdu.mmmi.cbse.commonBullet.Bullet;
import dk.sdu.mmmi.cbse.commonCollision.CollisionType;
import dk.sdu.mmmi.cbse.commonCollision.ICollidable;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;
import dk.sdu.mmmi.cbse.commonPlayer.Player;

import java.util.Collection;
import java.util.ServiceLoader;

import static java.util.stream.Collectors.toList;

public class CollisionHandler implements ICollisionHandler {
    @Override
    public void handleCollision(Entity e1, Entity e2, GameData gameData, World world) {
        if ((e1 instanceof ICollidable && e2 instanceof ICollidable) && e1 != e2) {
            ICollidable ce1 = (ICollidable) e1;
            ICollidable ce2 = (ICollidable) e2;

            if (ce1.getCollisionType() == CollisionType.BULLET && ce2.getCollisionType() == CollisionType.ASTEROID) {
                world.removeEntity(e2);

                Bullet bullet = (Bullet) e1;
                if (bullet.getOwner() instanceof Player) {
                    gameData.setAsteroidsKilled(gameData.getAsteroidsKilled() + 1);
                }

                if (getAsteroidSplitter().stream().findFirst().isPresent()) {
                    getAsteroidSplitter().stream().findFirst().get().splitAsteroid((Asteroid) e2, gameData, world);
                }
            }
            if (ce1.getCollisionType() == CollisionType.BULLET && ce2.getCollisionType() == CollisionType.ENTITY) {
                e2.takeDamage(e1.getDamage());
            }
            if (ce1.getCollisionType() == CollisionType.ASTEROID && ce2.getCollisionType() == CollisionType.ENTITY) {
                e2.takeDamage(e1.getDamage());
            }
            if (ce1.getCollisionType() == CollisionType.ENTITY && ce2.getCollisionType() == CollisionType.ENTITY) {
                // Since the collision will also be handled for the other entity
                e1.takeDamage(e2.getDamage());
            }

        }
        if (e1.getHealth() <= 0) {
            world.removeEntity(e1);
        }
        if (e2.getHealth() <= 0) {
            world.removeEntity(e2);
        }
    }

    private Collection<? extends IAsteroidSplitter> getAsteroidSplitter() {
        return ServiceLoader.load(IAsteroidSplitter.class).stream().map(ServiceLoader.Provider::get).collect(toList());
    }
}
