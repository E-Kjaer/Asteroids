package dk.sdu.mmmi.cbse.commonBullet;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

public interface IBulletSPI {
    public Entity createBullet(Entity e, GameData gameData);
}
