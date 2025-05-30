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
     * <p>
     * Precondition: The provided entity must exist
     * <p>
     * Postcondition: A bullet must have been created and returned
     *
     * @param e Entity that wants to create a bullet
     * @return A new Bullet object
     *
     * @see Bullet
     * @see Entity
     */
    Entity createBullet(Entity e);
}
