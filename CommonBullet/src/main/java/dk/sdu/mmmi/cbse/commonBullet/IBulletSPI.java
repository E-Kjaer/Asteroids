package dk.sdu.mmmi.cbse.commonBullet;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

/**
 * SPI for creating a bullet
 */
public interface IBulletSPI {
    /**
     * Method for creating a bullet
     *
     * @param e Entity that wants to create a bullet
     * @param gameData GameData object
     * @return A new Bullet object
     *
     * @see Bullet
     * @see Entity
     * @see GameData
     */
    Entity createBullet(Entity e, GameData gameData);
}
