package dk.sdu.mmmi.cbse.commonAsteroid;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.commonCollision.CollisionType;
import dk.sdu.mmmi.cbse.commonCollision.ICollidable;

public class Asteroid extends Entity implements ICollidable {
    @Override
    public CollisionType getCollisionType() {
        return CollisionType.ASTEROID;
    }
}
