package dk.sdu.mmmi.cbse.commonPlayer;

import dk.sdu.mmmi.cbse.common.data.Entity;

public class Player extends Entity {
    private long bulletCooldown;
    private long lastShot;

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
