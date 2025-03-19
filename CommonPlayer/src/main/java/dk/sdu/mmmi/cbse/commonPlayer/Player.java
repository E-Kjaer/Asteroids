package dk.sdu.mmmi.cbse.commonPlayer;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.commonCollision.CollisionType;
import dk.sdu.mmmi.cbse.commonCollision.ICollidable;

public class Player extends Entity implements ICollidable {
    private long bulletCooldown;
    private long lastShot;

    @Override
    public CollisionType getCollisionType() {
        return CollisionType.ENTITY;
    }

    public long getBulletCooldown() {
        return bulletCooldown;
    }

    public void setBulletCooldown(long bulletCooldown) {
        this.bulletCooldown = bulletCooldown;
    }

    public long getLastShot() {
        return lastShot;
    }

    public void setLastShot(long lastShot) {
        this.lastShot = lastShot;
    }
}
