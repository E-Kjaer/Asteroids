package dk.sdu.mmmi.cbse.commonBullet;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.commonCollision.CollisionType;
import dk.sdu.mmmi.cbse.commonCollision.ICollidable;

public class Bullet extends Entity implements ICollidable {
    private Entity owner;

    @Override
    public CollisionType getCollisionType() {
        return CollisionType.BULLET;
    }

    public Entity getOwner() {
        return owner;
    }

    public void setOwner(Entity owner) {
        this.owner = owner;
    }
}
