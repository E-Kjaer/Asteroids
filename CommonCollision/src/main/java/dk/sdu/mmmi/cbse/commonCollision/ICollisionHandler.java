package dk.sdu.mmmi.cbse.commonCollision;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 * SPI for services that provide a method of handling collisions between two entities.
 * This allows for the use of different collisions handlers without changing the implementation.
 */
public interface ICollisionHandler {
    /**
     * Method for handling collisions
     *
     * @param e1 The first colliding entity
     * @param e2 The second colliding entity
     * @param gameData The GameData object used in the game
     * @param world The World object used in the game, this holds all entities
     *
     * @see Entity
     * @see GameData
     * @see World
     */
    void handleCollision(Entity e1, Entity e2, GameData gameData, World world);
}
