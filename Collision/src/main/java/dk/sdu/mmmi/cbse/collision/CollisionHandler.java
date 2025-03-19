package dk.sdu.mmmi.cbse.collision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.commonCollision.CollisionType;
import dk.sdu.mmmi.cbse.commonCollision.ICollidable;
import dk.sdu.mmmi.cbse.commonCollision.ICollisionHandler;

public class CollisionHandler implements ICollisionHandler {
    @Override
    public void handleCollision(Entity e1, Entity e2, GameData gameData, World world) {
        if ((e1 instanceof ICollidable && e2 instanceof ICollidable) && e1 != e2) {
            ICollidable ce1 = (ICollidable) e1;
            ICollidable ce2 = (ICollidable) e2;

            if (ce1.getCollisionType() == CollisionType.BULLET && ce2.getCollisionType() == CollisionType.ASTEROID) {
                world.removeEntity(e2);
            }
            if (ce1.getCollisionType() == CollisionType.BULLET && ce2.getCollisionType() == CollisionType.ENTITY) {
                world.removeEntity(e2);
            }
            if (ce1.getCollisionType() == CollisionType.ASTEROID && ce2.getCollisionType() == CollisionType.ENTITY) {
                world.removeEntity(e2);
            }
            if (ce1.getCollisionType() == CollisionType.ENTITY && ce2.getCollisionType() == CollisionType.ENTITY) {
                world.removeEntity(e1);
                world.removeEntity(e2);
            }

        }
    }
}
